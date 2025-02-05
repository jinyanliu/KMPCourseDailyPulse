package se.sugarest.dailypulse.articles.di

import org.koin.dsl.module
import se.sugarest.dailypulse.articles.ArticlesService
import se.sugarest.dailypulse.articles.ArticlesUseCase
import se.sugarest.dailypulse.articles.ArticlesViewModel

val articlesModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}