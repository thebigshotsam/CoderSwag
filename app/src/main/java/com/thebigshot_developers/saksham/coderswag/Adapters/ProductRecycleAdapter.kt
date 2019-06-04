package com.thebigshot_developers.saksham.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.thebigshot_developers.saksham.coderswag.R
import com.thebigshot_developers.saksham.coderswag.model.cateogary
import com.thebigshot_developers.saksham.coderswag.model.product

class ProductRecycleAdapter(val context: Context, val producttype:List<product>) : RecyclerView.Adapter<ProductRecycleAdapter.Holder> (){
    override fun onCreateViewHolder(p0: ViewGroup, position: Int): Holder {
        val view= LayoutInflater.from(context).inflate(com.thebigshot_developers.saksham.coderswag.R.layout.product_list_item, null)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return producttype.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(producttype[position],context)
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val productImage=itemView?.findViewById<ImageView>(R.id.productimage)
        val productName=itemView?.findViewById<TextView>(R.id.productname)
        val productPrice:TextView=itemView?.findViewById<TextView>(R.id.productprice)
        fun bindCategory(productType:product,context:Context){
            val resourceId = context.resources.getIdentifier(productType.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text=productType.title
            productPrice.text=productType.price
        }
    }
}