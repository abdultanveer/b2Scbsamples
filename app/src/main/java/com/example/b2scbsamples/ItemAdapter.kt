package com.example.b2scbsamples

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.b2scbsamples.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    var TAG = ItemAdapter::class.java.simpleName
    class ItemViewHolder(private val rowPlank:View): RecyclerView.ViewHolder(rowPlank){

        val tvRowPlank: TextView = rowPlank.findViewById(R.id.item_title)
        //Log.i(TAG,"anamit gave row plank to deepak")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        Log.i(TAG,"anamit bought a row plank from market")
        val rowPlankMarket = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return  ItemViewHolder(rowPlankMarket)
    }

    override fun getItemCount(): Int {
        Log.i(TAG,"arunesh counting no of items in dataset --"+dataset.size)
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        Log.i(TAG,"faraah is writing "+ dataset[position]+" at "+position)
        val item = dataset[position]
        holder.tvRowPlank.text = context.resources.getString(item.stringResourceId)
    }

}