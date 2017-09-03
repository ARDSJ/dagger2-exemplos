package com.ardsj.dagger2samples.contract

import com.ardsj.dagger2samples.entity.Task

interface MainActivityContract {

    interface View: com.ardsj.dagger2samples.contract.View{

        fun showTasksInList(taskList: List<Task>)

        fun addTaskInList(task: Task)

    }

    interface Presenter: com.ardsj.dagger2samples.contract.Presenter {

        fun createTask(title: String, description: String)

        fun loadTasks()

    }

}