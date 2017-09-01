package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.MainActivity
import com.ardsj.dagger2samples.di.scope.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class
            ,PersistenceModule::class
            ,LocalRepositoryModule::class))
    abstract fun mainActivity(): MainActivity

}