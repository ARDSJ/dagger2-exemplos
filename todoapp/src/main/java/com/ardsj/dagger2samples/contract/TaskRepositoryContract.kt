package com.ardsj.dagger2samples.contract

import com.ardsj.dagger2samples.entity.Task

interface TaskRepositoryContract {

    fun createOrUpdateTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit)

    fun deleteTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit)

    fun loadTasks(actionSuccess: (tasks: List<Task>) -> Unit, actionError: (e: Exception) -> Unit)

    fun loadTask(taskId: Int,actionSuccess: (tasks: Task) -> Unit, actionError: (e: Exception) -> Unit)

}