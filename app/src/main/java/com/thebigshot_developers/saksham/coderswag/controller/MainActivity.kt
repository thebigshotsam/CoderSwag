package com.thebigshot_developers.saksham.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import com.thebigshot_developers.saksham.coderswag.Adapters.CategoryAdapter
import com.thebigshot_developers.saksham.coderswag.Adapters.CategoryRecycleAdapter
import com.thebigshot_developers.saksham.coderswag.R
import com.thebigshot_developers.saksham.coderswag.model.cateogary
import com.thebigshot_developers.saksham.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= CategoryRecycleAdapter(this,DataService.categories)
        CategoryListView.adapter=adapter
        val layoutManager= LinearLayoutManager(this)
        CategoryListView.layoutManager=layoutManager
        CategoryListView.setHasFixedSize(true)

    }
}
