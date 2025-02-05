package se.sugarest.dailypulse.di

import se.sugarest.dailypulse.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)