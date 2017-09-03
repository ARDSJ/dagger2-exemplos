package com.ardsj.dagger2samples.presenter

import com.ardsj.dagger2samples.contract.MainActivityContract
import com.ardsj.dagger2samples.contract.TaskRepositoryContract
import com.ardsj.dagger2samples.contract.View
import com.ardsj.dagger2samples.entity.Task
import javax.inject.Inject


class MainActivityPresenter
@Inject constructor(): MainActivityContract.Presenter {

    @Inject
    lateinit var localTaskRepository: TaskRepositoryContract

    var view: MainActivityContract.View? = null

    override fun takeView(view: View) {

        this.view = view as MainActivityContract.View

    }

    override fun createTask(title: String, description: String) {

        val task = Task()

        task.title = title

        task.description = description

        localTaskRepository.createTask(

                task,
                {

                },
                {

                }

        )

    }

    override fun loadTasks() {

        localTaskRepository.loadTasks({
            view?.showTasksInList(it)
        },{

        })

    }

}