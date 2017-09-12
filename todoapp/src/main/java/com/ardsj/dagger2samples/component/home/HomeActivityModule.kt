package com.ardsj.dagger2samples.component.home

import com.ardsj.dagger2samples.di.qualifier.MainActivityAdapter
import com.ardsj.dagger2samples.di.scope.ActivityScoped
import dagger.Binds
import dagger.Module

@Module
abstract class HomeActivityModule {

    @ActivityScoped
    @Binds
    abstract fun presenter(presenter: HomeActivityPresenter): HomeActivityContract.Presenter

    @ActivityScoped
    @MainActivityAdapter
    @Binds
    abstract fun adapter(adapter: HomeActivityListAdapter): HomeActivityListAdapter

}


