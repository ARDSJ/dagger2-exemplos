package com.ardsj.dagger2samples.component.createorupdate

import com.ardsj.dagger2samples.di.scope.ActivityScoped
import dagger.Module
import dagger.Provides

@Module
class CreateOrUpdateActivityModule {

    @ActivityScoped
    @Provides
    fun presenter(presenter: CreateOrUpdateActivityPresenter): CreateOrUpdateActivityContract.Presenter =
            presenter

    @ActivityScoped
    @Provides
    fun taskId(activity: CreateOrUpdateActivity): String {
        val stringExtra = activity.intent.getStringExtra(CreateOrUpdateActivity.EXTRA_TASK_ID)
        return if(!stringExtra.isNullOrBlank()) stringExtra else ""
    }

}