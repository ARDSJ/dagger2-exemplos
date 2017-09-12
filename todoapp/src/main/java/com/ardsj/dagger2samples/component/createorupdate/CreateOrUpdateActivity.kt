package com.ardsj.dagger2samples.component.createorupdate

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.ardsj.dagger2samples.R
import com.ardsj.dagger2samples.entity.Task
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_create_or_update.*
import javax.inject.Inject

class CreateOrUpdateActivity : DaggerAppCompatActivity(), CreateOrUpdateActivityContract.View {
    companion object {

        val EXTRA_TASK_ID: String = "TASK_ID"
    }
    @Inject
    lateinit var presenter: CreateOrUpdateActivityContract.Presenter

    @Inject
    lateinit var extraTaskId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_or_update)
        presenter.takeView(this)
    }

    override fun onTaskSavedSuccessfully() {
        finish()
    }

    override fun onTaskSavedError(e: Exception) {
    }

    override fun showTask(task: Task) {

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_save, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.save_task -> createOrUpdateTask()
            android.R.id.home -> finish()
        }
        return true
    }

    private fun createOrUpdateTask(){

        val taskTitle = task_title.text.toString()
        val taskDescription = task_description.text.toString()

        if(taskTitle.isNotEmpty() && taskDescription.isNotEmpty())
            presenter.createOrUpdateTask(extraTaskId, taskTitle, taskDescription)

    }

}
