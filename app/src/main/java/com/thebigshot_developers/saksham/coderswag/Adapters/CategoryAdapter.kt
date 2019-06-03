package com.thebigshot_developers.saksham.coderswag.Adapters

import android.content.Context
import android.support.drawerlayout.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.thebigshot_developers.saksham.coderswag.model.cateogary

class CategoryAdapter(context:Context,categories:List<cateogary>): BaseAdapter() {
    val context=context
    val categories=categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder
        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(com.thebigshot_developers.saksham.coderswag.R.layout.category_list_item_view, null)
            holder=ViewHolder()
            holder.categoryImage=categoryView.findViewById(com.thebigshot_developers.saksham.coderswag.R.id.categoryimage)
            holder.categoryName =categoryView.findViewById(com.thebigshot_developers.saksham.coderswag.R.id.categoryname)
            categoryView.tag=holder

        }else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

            val category = categories[position]
            holder.categoryName?.text = category.title
            val resourceId = context.resources.getIdentifier(category.Image, "drawable", context.packageName)
            holder.categoryImage?.setImageResource(resourceId)
            return categoryView
        }



    override fun getItem(position: Int): Any {
        return  categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
    private class ViewHolder{
        var categoryImage:ImageView?=null
        var categoryName:TextView?=null
    }
}