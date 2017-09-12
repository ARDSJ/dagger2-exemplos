package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.component.createorupdate.CreateOrUpdateActivity
import com.ardsj.dagger2samples.component.createorupdate.CreateOrUpdateActivityModule
import com.ardsj.dagger2samples.component.home.HomeActivity
import com.ardsj.dagger2samples.component.home.HomeActivityModule
import com.ardsj.dagger2samples.di.scope.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(
             HomeActivityModule::class
            ,PersistenceModule::class
            ,LocalRepositoryModule::class
            ,UtilModule::class))
    abstract fun mainActivity(): HomeActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(
             CreateOrUpdateActivityModule::class
            ,PersistenceModule::class
            ,LocalRepositoryModule::class
    ))
    abstract fun createOrUpdateActivity(): CreateOrUpdateActivity

}