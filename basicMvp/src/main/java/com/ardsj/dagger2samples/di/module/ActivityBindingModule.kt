package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = arrayOf())
    abstract fun mainActivity(): MainActivity

}