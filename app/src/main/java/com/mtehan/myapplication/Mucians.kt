package com.mtehan.myapplication

open class Mucians(name: String, instrument: String, age: Int) {
    var name: String? = name
        private set
        get
    var instrument: String? = instrument
    var age: Int? = age
    fun bannStar(starName: String): String {
        if (starName.equals("Vavela")) {

            return "No Banned"
        } else {
            return "Banned"
        }

    }
}