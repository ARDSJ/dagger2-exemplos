package com.ardsj.dagger2samples.entity

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import javax.inject.Inject

open class Task: RealmObject(){

    @PrimaryKey var id: Int? = null

    var title: String? = null

    var description: String? = null

}