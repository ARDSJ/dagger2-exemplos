package com.ardsj.dagger2samples.contract

import com.ardsj.dagger2samples.entity.Task

interface CreateOrUpdateActivityContract {

    interface View: com.ardsj.dagger2samples.contract.View{

    }

    interface Presenter: com.ardsj.dagger2samples.contract.Presenter {

        fun createOrUpdateTask(title: String, description: String)

        fun loadTask(taskId: Int)

    }

}