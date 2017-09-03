package com.ardsj.dagger2samples.di.module

import android.content.Context
import android.view.LayoutInflater
import dagger.Module
import dagger.Provides

@Module
class UtilModule {

    @Provides
    fun inflater(context: Context): LayoutInflater = LayoutInflater.from(context)

}