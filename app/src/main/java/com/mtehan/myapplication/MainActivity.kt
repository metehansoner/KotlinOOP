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


    }
}
