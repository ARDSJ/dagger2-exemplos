package com.ardsj.dagger2samples.component.home

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ardsj.dagger2samples.R
import com.ardsj.dagger2samples.entity.Task
import kotlinx.android.synthetic.main.activity_main_list_item.view.*
import javax.inject.Inject

class HomeActivityListAdapter
@Inject
constructor(): RecyclerView.Adapter<MainActivityListViewHolder>() {

    @Inject
    lateinit var inflater: LayoutInflater

    @Inject
    lateinit var context: Context

    var dataStore: MutableList<Task> = mutableListOf()

    fun add(task: Task) {
        dataStore.add(task)
        notifyDataSetChanged()
    }

    fun add(taskList: List<Task>) {
        dataStore.addAll(taskList)
        notifyDataSetChanged()
    }

    fun clear(){
        dataStore.clear()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainActivityListViewHolder {

        val view = inflater.inflate(R.layout.activity_main_list_item, null)

        return MainActivityListViewHolder(view)

    }

    override fun onBindViewHolder(holder: MainActivityListViewHolder?, position: Int) {

        val task = dataStore[position]

        holder?.view.let {
            it?.task_name?.setText(task.title)
        }

    }

    override fun getItemCount(): Int = dataStore.size

}
