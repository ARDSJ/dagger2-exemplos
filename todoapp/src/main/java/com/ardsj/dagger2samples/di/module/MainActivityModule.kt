package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.di.contract.MainActivityContract
import com.ardsj.dagger2samples.di.presenter.MainActivityPresenter
import com.ardsj.dagger2samples.di.scope.ActivityScoped
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @ActivityScoped
    @Binds
    abstract fun presenter(presenter: MainActivityPresenter): MainActivityContract.Presenter

}