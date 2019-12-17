package com.mtehan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("James", 50)

        var musician = Mucians("James", "Violin", 50)

        //inheritance

        var lars = SuperMusicians("Vavela", "Violin", 25)
        println(lars.name)
        println(lars.bannStar("Pink"))

        //Polymorphism

        //static Polymorphism

        var math = Mathematics()
        println(math.sum())
        println(math.sum(3, 4))
        println(math.sum(3, 4, 5))

        //dynamicPolymorphism

        var animal = Animal()
        animal.sing()

        var cat = Cat()
        cat.sing()

        //abstract & interface

        println(myUser.information())

        //var people=People() =>Cannot create an instance of an abstaract class

        var myPiano=Piano()
        myPiano.brand="Yamaha"
        myPiano.digital=true
        println(myPiano.brand)
        println(myPiano.digital.toString())
        println(myPiano.roomName)
        myPiano.info()



    }
}
