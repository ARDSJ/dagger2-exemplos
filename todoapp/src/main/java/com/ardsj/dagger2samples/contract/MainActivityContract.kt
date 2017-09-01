package com.ardsj.dagger2samples.contract

interface MainActivityContract {

    interface View{

    }

    interface Presenter{

        fun createTask(title: String, description: String)

        fun loadTasks()

    }

}