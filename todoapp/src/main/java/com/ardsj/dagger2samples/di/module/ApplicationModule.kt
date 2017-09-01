package com.ardsj.dagger2samples.di.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ApplicationModule{

    @Binds
    abstract fun context(application: Application): Context

}