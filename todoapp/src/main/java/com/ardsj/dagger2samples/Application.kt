package com.ardsj.dagger2samples

import com.ardsj.dagger2samples.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class Application : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val applicationComponent = DaggerApplicationComponent.builder()
                .application(this)
                .build()
        applicationComponent.inject(this)
        return applicationComponent
    }

}
