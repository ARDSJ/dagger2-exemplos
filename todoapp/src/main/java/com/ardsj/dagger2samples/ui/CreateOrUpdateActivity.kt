package com.ardsj.dagger2samples.ui

import android.os.Bundle
import android.view.Menu
import com.ardsj.dagger2samples.R
import com.ardsj.dagger2samples.contract.CreateOrUpdateActivityContract
import dagger.android.support.DaggerAppCompatActivity

class CreateOrUpdateActivity : DaggerAppCompatActivity(), CreateOrUpdateActivityContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_or_update)
    }

    override fun showTask() {

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_save, menu)
        return true
    }

}
