package se.sugarest.dailypulse.articles

class ArticlesUseCase(
    private val service: ArticlesService
) {
    suspend fun getArticles(): List<Article> {
        val articlesRaw = service.fetchArticles()
        return mapArticles(articlesRaw)
    }

    private fun mapArticles(articlesRaw: List<ArticleRaw>): List<Article> =
        articlesRaw.map { articleRaw ->
            Article(
                title = articleRaw.title,
                desc = articleRaw.desc ?: "Click to find out more",
                date = articleRaw.date,
                imageUrl = articleRaw.imageUrl ?: "https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg"
            )
        }
}