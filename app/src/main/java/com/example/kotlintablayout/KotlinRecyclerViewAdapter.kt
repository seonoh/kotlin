package com.example.kotlintablayout

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.item_list.view.*

/**
 * Created by 선오 on 2017-11-06.
 */
class KotlinRecyclerViewAdapter(val context: Context): RecyclerView.Adapter<KotlinRecyclerViewAdapter.RecyclerViewHolder>(){

    var name : ArrayList<String>? = null
    var poster : Map<Int,Int>? = null

    inner class RecyclerViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

        fun toBind(position: Int){
            itemView.poster_img.setImageResource(poster?.get(position)!!)
            itemView.title_tv.setText(name?.get(position))

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerViewHolder
            = RecyclerViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.item_list,parent,false))

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: RecyclerViewHolder?, position: Int) {
        holder?.toBind(position)
        holder?.itemView?.setOnClickListener{
            Toast.makeText(context,"$position Picture is clicked !!",Toast.LENGTH_LONG).show()
        }
    }
}