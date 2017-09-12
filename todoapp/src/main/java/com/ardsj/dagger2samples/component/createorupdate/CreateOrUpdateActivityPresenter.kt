package com.ardsj.dagger2samples.component.createorupdate

import com.ardsj.dagger2samples.contract.TaskRepositoryContract
import com.ardsj.dagger2samples.contract.View
import com.ardsj.dagger2samples.entity.Task
import javax.inject.Inject

class CreateOrUpdateActivityPresenter
@Inject constructor(): CreateOrUpdateActivityContract.Presenter {

    @Inject
    lateinit var localTaskRepository: TaskRepositoryContract

    var view: CreateOrUpdateActivityContract.View? = null

    override fun takeView(view: View) {

        this.view = view as CreateOrUpdateActivityContract.View

    }

    override fun loadTask(taskId: Int) {

        localTaskRepository.loadTask(taskId,
                {
                    view?.showTask(it)
                },
                {

                }
        )

    }

    override fun createOrUpdateTask(taskId: String? ,title: String, description: String) {

        val task = Task()

        if(!taskId.isNullOrBlank())
            task.id = taskId

        task.title = title

        task.description = description

        localTaskRepository.createOrUpdateTask(
                task,
                {
                    view?.onTaskSavedSuccessfully()
                },
                {
                    view?.onTaskSavedError(it)
                }

        )

    }

}