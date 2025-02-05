package se.sugarest.dailypulse.android.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import se.sugarest.dailypulse.articles.ArticlesViewModel

val viewModelModule = module {
    viewModel { ArticlesViewModel(get()) }
}