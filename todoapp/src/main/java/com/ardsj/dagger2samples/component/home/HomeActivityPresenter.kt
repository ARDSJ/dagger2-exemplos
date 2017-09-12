package com.ardsj.dagger2samples.component.home

import com.ardsj.dagger2samples.contract.TaskRepositoryContract
import com.ardsj.dagger2samples.contract.View
import javax.inject.Inject


class HomeActivityPresenter
@Inject constructor(): HomeActivityContract.Presenter {

    @Inject
    lateinit var localTaskRepository: TaskRepositoryContract

    var view: HomeActivityContract.View? = null

    override fun takeView(view: View) {

        this.view = view as HomeActivityContract.View

    }

    override fun loadTasks() {

        localTaskRepository.loadTasks({
            view?.showTasksInList(it)
        },{

        })

    }

}