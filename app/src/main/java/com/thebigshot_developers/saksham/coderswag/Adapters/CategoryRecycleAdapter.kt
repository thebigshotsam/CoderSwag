package com.thebigshot_developers.saksham.coderswag.Adapters

import android.content.Context
import android.support.constraint.R.id.parent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.thebigshot_developers.saksham.coderswag.R
import com.thebigshot_developers.saksham.coderswag.model.cateogary
import java.util.*

class CategoryRecycleAdapter(val context: Context, val categories:List<cateogary>):RecyclerView.Adapter<CategoryRecycleAdapter.Holder> (){
    override fun onCreateViewHolder(p0: ViewGroup, position: Int): Holder {
      val view=LayoutInflater.from(context).inflate(com.thebigshot_developers.saksham.coderswag.R.layout.category_list_item_view, null)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val categoryImage=itemView?.findViewById<ImageView>(R.id.categoryimage)
        val categoryName=itemView?.findViewById<TextView>(R.id.categoryname)
        fun bindCategory(category:cateogary,context:Context){
            val resourceId = context.resources.getIdentifier(category.Image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text=category.title
        }
    }
}