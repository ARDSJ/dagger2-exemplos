package com.ardsj.dagger2samples.ui

import android.os.Bundle
import android.view.Menu
import com.ardsj.dagger2samples.R
import dagger.android.support.DaggerAppCompatActivity

class CreateOrUpdateActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_or_update)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_save, menu)
        return true
    }

}
