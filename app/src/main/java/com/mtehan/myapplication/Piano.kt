package com.mtehan.myapplication

class Piano : HouseDecor, Instrument {
    override fun info() {
        println("info")
    }

    override var roomName: String
        get() = "Kitchen"
        set(value) {}
    var brand: String? = null
    var digital: Boolean? = null
}