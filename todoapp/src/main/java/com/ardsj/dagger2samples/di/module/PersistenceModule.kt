package com.ardsj.dagger2samples.di.module

import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration

@Module
class PersistenceModule {

    @Provides
    fun realm(): Realm {

        val realmConfig = RealmConfiguration.Builder()
        realmConfig
                .name("com.ardsj.dagger2samples")
                .schemaVersion(1)
        Realm.setDefaultConfiguration(realmConfig.build())

        return Realm.getDefaultInstance()

    }


}