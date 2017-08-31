package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.MainActivity
import com.ardsj.dagger2samples.di.scope.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun mainActivity(): MainActivity

}