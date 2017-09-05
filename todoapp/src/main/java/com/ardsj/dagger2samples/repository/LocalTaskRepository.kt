package com.ardsj.dagger2samples.repository

import com.ardsj.dagger2samples.contract.TaskRepositoryContract
import com.ardsj.dagger2samples.entity.Task
import io.realm.Realm
import javax.inject.Inject

class LocalTaskRepository
    @Inject constructor(): TaskRepositoryContract{

    @Inject
    lateinit var realm:Realm

    override fun loadTask(taskId: Int, actionSuccess: (tasks: Task) -> Unit, actionError: (e: Exception) -> Unit) {

        realm.executeTransaction {
            try {
                val task = it.where(Task::class.java).equalTo("id", taskId).findFirst()
                actionSuccess(task)
            }catch (e: Exception){
                actionError(e)
            }
        }

    }

    override fun loadTasks(actionSuccess: (tasks: List<Task>) -> Unit, actionError: (e: Exception) -> Unit) {

        realm.executeTransaction {

            try {
                val results = it.where(Task::class.java)
                        .findAll()
                actionSuccess(results.toList())
            }catch (e: Exception){
                actionError(e)
            }

        }
    }

    override fun createTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit) {

        realm.executeTransaction {

            try {

                it.copyToRealm(task)
                actionSuccess()

            }catch (e: Exception){

                actionError(e)

            }

        }

    }

    override fun updateTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit) {

        realm.executeTransaction {

            try {
                it.copyToRealmOrUpdate(task)
                actionSuccess()
            }catch (e: Exception){
                actionError(e)
            }

        }

    }

    override fun deleteTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit) {

        realm.executeTransaction {

            try {
                task.deleteFromRealm()
                actionSuccess()
            }catch (e: Exception){
                actionError(e)
            }

        }

    }

}