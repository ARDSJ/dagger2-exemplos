package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.ui.MainActivity
import com.ardsj.dagger2samples.di.scope.ActivityScoped
import com.ardsj.dagger2samples.ui.CreateOrUpdateActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(
             MainActivityModule::class
            ,PersistenceModule::class
            ,LocalRepositoryModule::class
            ,UtilModule::class))
    abstract fun mainActivity(): MainActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(
             MainActivityModule::class
            ,PersistenceModule::class
            ,LocalRepositoryModule::class
    ))
    abstract fun createOrUpdateActivity(): CreateOrUpdateActivity

}