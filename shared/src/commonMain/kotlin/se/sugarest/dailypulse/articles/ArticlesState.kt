package se.sugarest.dailypulse.articles

//Cannot use sealed class in KMP
data class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)