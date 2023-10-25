package com.example.b2scbsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.b2scbsamples.model.Dice
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //inflating the layout xml
        val rollButton: Button = findViewById(R.id.btnRoll)
        val rollNoTv : TextView = findViewById(R.id.tvRollno)
        val myDice = Dice(6)

        rollButton.setOnClickListener {
            rollNoTv.text = myDice.roll().toString()
           /* val view = findViewById<ConstraintLayout>(R.id.constrainlyt)
            Snackbar.make(view,"rolled the dice",Snackbar.LENGTH_SHORT).show()*/
        }

    }


    fun inflating(){
        val textView = TextView(this)
        textView.text = "happy android coding"
        textView.textSize = 32.0f
    }
}