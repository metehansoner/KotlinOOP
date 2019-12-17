package com.mtehan.myapplication

open class Cat : Animal() {

    fun test() {
        super.sing()
    }

    override fun sing() {

        println("Dog Class")
    }
}