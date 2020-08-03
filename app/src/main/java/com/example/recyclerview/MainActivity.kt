package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import layout.AgeRecyclerViewAdapter
import layout.NamesRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf("Stephanie", "Marybeth", "Betty", "Meek", "Jay", "Carly", "Jerry", "Shayne", "Ruth"))
        rvNames.adapter = namesAdapter
    }
        //rvAge.layoutManager = LinearLayoutManager(baseContext)
        var ageAdapter= AgeRecyclerViewAdapter(listOf(18, 20, 30, 15, 67, 18, 47, 24, 25, 10))
       // rvAge.adapter= ageAdapter
}