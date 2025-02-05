package se.sugarest.dailypulse.android

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import se.sugarest.dailypulse.android.di.viewModelModule
import se.sugarest.dailypulse.di.sharedKoinModules

class DailyPulseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelModule

        startKoin {
            androidContext(this@DailyPulseApp)
            modules(modules)
        }
    }
}