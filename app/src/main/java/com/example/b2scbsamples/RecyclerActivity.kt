package com.example.b2scbsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.b2scbsamples.data.Datasource
import com.example.b2scbsamples.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    var TAG = RecyclerActivity::class.java.simpleName
    lateinit var binding : ActivityRecyclerBinding //declaration

    //egg stage of the butterfly -
    // comes out of storage and memory gets allocated in the ram for activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i(TAG,"created")
        binding.tvAffirm.text = Datasource().loadAffirmations().size.toString()

        val myDataset = Datasource().loadAffirmations()

        //context = history, global variables for the whole app

        binding.recyclerView.adapter = ItemAdapter(this,myDataset,)
        binding.recyclerView.setHasFixedSize(true)
    }

    //activity is visible to the user
    override fun onStart() {
        super.onStart()
        Log.i(TAG,"started")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"paused-- save the game state")

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"resumed-- restore the game state")

    }


    //activity hibernate
    override fun onStop() {
        super.onStop()
        Log.i(TAG,"stopped")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"restart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"destroyed")

    }
}