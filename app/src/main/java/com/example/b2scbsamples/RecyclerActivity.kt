package com.example.b2scbsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.b2scbsamples.data.Datasource
import com.example.b2scbsamples.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    lateinit var binding : ActivityRecyclerBinding //declaration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvAffirm.text = Datasource().loadAffirmations().size.toString()

        val myDataset = Datasource().loadAffirmations()

        //context = history, global variables for the whole app

        binding.recyclerView.adapter = ItemAdapter(this,myDataset,)
        binding.recyclerView.setHasFixedSize(true)


    }
}