package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.contract.MainActivityContract
import com.ardsj.dagger2samples.di.qualifier.MainActivityAdapter
import com.ardsj.dagger2samples.di.scope.ActivityScoped
import com.ardsj.dagger2samples.presenter.MainActivityPresenter
import com.ardsj.dagger2samples.ui.adapter.MainActivityListAdapter
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @ActivityScoped
    @Binds
    abstract fun presenter(presenter: MainActivityPresenter): MainActivityContract.Presenter

    @ActivityScoped
    @MainActivityAdapter
    @Binds
    abstract fun adapter(adapter: MainActivityListAdapter): MainActivityListAdapter

}