package com.thebigshot_developers.saksham.coderswag.controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.thebigshot_developers.saksham.coderswag.Adapters.ProductRecycleAdapter
import com.thebigshot_developers.saksham.coderswag.R
import com.thebigshot_developers.saksham.coderswag.services.DataService
import com.thebigshot_developers.saksham.coderswag.utilities.EXTRA_CAT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var adapter: ProductRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val cattype=intent.getStringExtra(EXTRA_CAT)
        adapter= ProductRecycleAdapter(this, DataService.sendType(cattype))
        var orientation=resources.configuration.orientation
        var spancount=2
        if(orientation==Configuration.ORIENTATION_LANDSCAPE)
            spancount=3
        if(resources.configuration.screenWidthDp>720)
        spancount=3
        val layoutmanager=GridLayoutManager(this,spancount)
       ProductListView.layoutManager=layoutmanager
        ProductListView.adapter=adapter
    }
}
