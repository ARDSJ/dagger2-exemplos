package com.ardsj.dagger2samples.entity

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required
import java.util.*
import javax.inject.Inject

open class Task: RealmObject(){

    @PrimaryKey
    @Required
    var id: String? = UUID.randomUUID().toString()

    var title: String? = null

    var description: String? = null

}