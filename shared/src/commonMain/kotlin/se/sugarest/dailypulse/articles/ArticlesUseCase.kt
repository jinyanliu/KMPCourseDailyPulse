package se.sugarest.dailypulse.articles

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.todayIn
import kotlin.math.abs

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
                date = getDaysAgoString(articleRaw.date),
                imageUrl = articleRaw.imageUrl
                    ?: "https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg"
            )
        }

    private fun getDaysAgoString(date: String): String {
        val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
        val days = today.daysUntil(
            Instant.parse(date).toLocalDateTime(TimeZone.currentSystemDefault()).date
        )

        val result = when {
            abs(days) > 1 -> "${abs(days)} days ago"
            abs(days) == 1 -> "Yesterday"
            else -> "Today"
        }

        return result
    }
}