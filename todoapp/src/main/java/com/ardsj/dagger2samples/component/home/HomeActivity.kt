package com.ardsj.dagger2samples.component.home

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.ardsj.dagger2samples.R
import com.ardsj.dagger2samples.entity.Task
import com.ardsj.dagger2samples.component.createorupdate.CreateOrUpdateActivity
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class HomeActivity : DaggerAppCompatActivity(), HomeActivityContract.View{

    @Inject
    lateinit var presenter: HomeActivityContract.Presenter

    @Inject
    lateinit var adapter: HomeActivityListAdapter

    override fun showTasksInList(taskList: List<Task>) {
        adapter.add(taskList)
    }

    override fun addTaskInList(task: Task) {
        adapter.add(task)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAdapter()
        presenter.takeView(this)
        presenter.loadTasks()
    }

    override fun onRestart() {
        super.onRestart()
        adapter.clear()
        presenter.loadTasks()
    }

    private fun setupAdapter() {
        list_adapter.layoutManager = LinearLayoutManager(this)
        list_adapter.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.new_task){
            goToCreateOrUpdateActivity()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun goToCreateOrUpdateActivity(){
        startActivity(Intent(this, CreateOrUpdateActivity::class.java))
    }

}
