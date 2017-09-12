package com.ardsj.dagger2samples.component.createorupdate

import com.ardsj.dagger2samples.entity.Task

interface CreateOrUpdateActivityContract {

    interface View: com.ardsj.dagger2samples.contract.View {

        fun showTask(task: Task)

        fun onTaskSavedSuccessfully()

        fun onTaskSavedError(e: Exception)

    }

    interface Presenter: com.ardsj.dagger2samples.contract.Presenter {

        fun createOrUpdateTask(taskId: String? ,title: String, description: String)

        fun loadTask(taskId: Int)

    }

}