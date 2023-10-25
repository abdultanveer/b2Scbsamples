package com.example.b2scbsamples.model

class Dice (val numSides: Int){
    var sides = 20

  /*  fun roll() :Int{
        val randomNumber = (1..6).random()
        return randomNumber
    }*/
   // val a = 10
    //fun roll() = (1..sides).random()
        //return randomNumber

    fun roll() = (1..numSides).random()


}