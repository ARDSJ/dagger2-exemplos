package com.ardsj.dagger2samples.di.module

import com.ardsj.dagger2samples.contract.TaskRepositoryContract
import com.ardsj.dagger2samples.repository.LocalTaskRepository
import dagger.Binds
import dagger.Module

@Module
abstract class LocalRepositoryModule {

    @Binds
    abstract fun localRepository(localTaskRepository: LocalTaskRepository): TaskRepositoryContract

}