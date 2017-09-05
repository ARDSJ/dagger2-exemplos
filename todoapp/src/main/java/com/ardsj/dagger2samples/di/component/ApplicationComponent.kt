package com.ardsj.dagger2samples.di.component

import android.app.Application
import com.ardsj.dagger2samples.di.module.ActivityBindingModule
import com.ardsj.dagger2samples.di.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
         ApplicationModule::class
        ,ActivityBindingModule::class
        ,AndroidSupportInjectionModule::class))
interface ApplicationComponent: AndroidInjector<DaggerApplication>{

    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): ApplicationComponent.Builder

        fun build(): ApplicationComponent
    }

}