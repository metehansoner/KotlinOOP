package com.mtehan.myapplication

class User : People {

    var name: String? = null
    var age: Int? = null

    constructor(nameInput: String, ageInput: Int) {

        this.name = nameInput
        this.age = ageInput
    }

    init {
        println("oluşturuldu....")
    }
}