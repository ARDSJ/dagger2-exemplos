package com.ardsj.dagger2samples.component.home

import com.ardsj.dagger2samples.entity.Task

interface HomeActivityContract {

    interface View: com.ardsj.dagger2samples.contract.View {

        fun showTasksInList(taskList: List<Task>)

        fun addTaskInList(task: Task)

    }

    interface Presenter: com.ardsj.dagger2samples.contract.Presenter {

        fun loadTasks()

    }

}