package com.example.kotlintablayout

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_kotlin.view.*

class KotlinFragmentGrid : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val view: View = inflater!!.inflate(R.layout.fragment_kotlin, container, false)

        val activity = activity


        val name = ArrayList<String>()

        name?.add("Seonoh")
        name?.add("Bitna")
        name?.add("Hancheol")

        var posterMap = mapOf<Int,Int>(0 to R.drawable.a, 1 to R.drawable.b,2 to R.drawable.c)

        var adapter = KotlinRecyclerViewAdapter(activity)

        adapter.name = name
        adapter.poster = posterMap

        var manager = GridLayoutManager(activity,3)
        manager.orientation = GridLayoutManager.VERTICAL
        view.vv.layoutManager = manager
        view.vv.adapter = adapter


        return view

    }


}