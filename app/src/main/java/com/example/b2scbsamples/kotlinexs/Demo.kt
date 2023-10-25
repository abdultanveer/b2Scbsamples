package com.example.b2scbsamples.kotlinexs

import com.example.b2scbsamples.javaexs.Student
import com.example.b2scbsamples.model.Dice

class Demo {
}

fun main() {
    //Dice myDice = new Dice();
    val normalDice = Dice(6)
    val myDice = Dice(20)  //creating dice
    println("no of sides in this dice is ${myDice.sides}")

   val uGot = myDice.roll()
    println("Your ${myDice.sides} sided dice rolled ${uGot}!")

    //var myStudent = Student("abdul",123,true)

}