package com.example.b2scbsamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.b2scbsamples.databinding.ActivityTipBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.math.ceil

class TipActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTipBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener {
            calculateTip()
        }
    }

    private fun calculateTip() {
        val cost = binding.etCost.text.toString().toDouble()

        val tipPercentage = when(binding.rgTipOptions.checkedRadioButtonId){
            R.id.rbAmazing -> 0.20
            R.id.rbGood -> 0.15
            else -> 0.10
        }

        var tip = cost * tipPercentage
       // val roundUp = binding.roundUpSwitch.isChecked
        if (binding.roundUpSwitch.isChecked) {tip = ceil(tip)  }
        binding.tipResult.text = getString(R.string.tip_amount, tip.toString())

        val view = binding.clLayout
        //findViewById<ConstraintLayout>(R.id.clLayout)
        Snackbar.make(view, "button was clicked", Snackbar.LENGTH_SHORT).show()
    }
}