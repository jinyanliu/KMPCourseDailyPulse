package se.sugarest.dailypulse.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(
    private val httpClient: HttpClient
){
    private val country = "us"
    private val category = "business"
    private val apiKey = "2e15ebda5e0048eda15a20aa46325a0b"

    suspend fun fetchArticles(): List<ArticleRaw>{
        val response: ArticlesResponse = httpClient.get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey").body()
        return response.articles
    }

}