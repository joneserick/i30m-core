package com.stefick.app

import android.app.Application
import br.com.jones.library.core.base.di.I30MCoreDI
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class I30MApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {

            androidLogger(level = Level.DEBUG)

            androidContext(this@I30MApplication)

            modules(I30MCoreDI.module)

        }
    }
}