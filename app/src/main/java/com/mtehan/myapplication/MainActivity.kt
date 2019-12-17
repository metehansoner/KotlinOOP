package com.mtehan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myUser = User("James", 50)

        val musician = Mucians("James", "Violin", 50)

        //inheritance

        val lars = SuperMusicians("Vavela", "Violin", 25)
        println(lars.name)
        println(lars.bannStar("Pink"))

        //Polymorphism

        //static Polymorphism

        val math = Mathematics()
        println(math.sum())
        println(math.sum(3, 4))
        println(math.sum(3, 4, 5))

        //dynamicPolymorphism

        val animal = Animal()
        animal.sing()

        val cat = Cat()
        cat.sing()

        //abstract & interface

        println(myUser.information())

        //var people=People() =>Cannot create an instance of an abstaract class

        val myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = true
        println(myPiano.brand)
        println(myPiano.digital.toString())
        println(myPiano.roomName)
        myPiano.info()

        //Lambda Expression
        fun printString(myString: String) {
            println(myString)
        }
        printString("myTest")

        val testString = { myString: String -> println(myString) }
        testString("My Lambda String")

        val multiplyLambda = { a: Int, b: Int -> a * b }
        val ex = multiplyLambda(4, 5)
        println(ex)
        val multiplyLambda2: (Int, Int) -> Int = { a, b -> a + b }
        val ex2 = multiplyLambda2(10, 5)
        println(ex2)

        //asenkron

        //callback Function

        fun downloadMusicians(url: String, completion: (Mucians) -> Unit) {
            //url download
            val music = Mucians("Broken Bells", "Rap", 35)
            completion(music)
        }
        downloadMusicians("Metelllica.com", { artist ->
            println(artist.name)
            println(artist.age)
        })


    }
}
