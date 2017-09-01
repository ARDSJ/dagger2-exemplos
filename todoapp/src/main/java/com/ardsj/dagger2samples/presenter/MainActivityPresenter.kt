package com.ardsj.dagger2samples.presenter

import com.ardsj.dagger2samples.contract.MainActivityContract
import com.ardsj.dagger2samples.contract.TaskRepositoryContract
import javax.inject.Inject


class MainActivityPresenter
@Inject constructor(): MainActivityContract.Presenter {

    @Inject
    lateinit var localTaskRepository: TaskRepositoryContract

}