package com.example.fooddeliverymvp.adapter


import FoodsModel
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddeliverymvp.R
import com.example.fooddeliverymvp.view.RecyclerViewClickListner
import kotlinx.android.synthetic.main.item_layout.view.*
import java.util.ArrayList


class FoodListAdapter(var context: Context, var shopsList: ArrayList<FoodsModel.ShopX?>, var shopClickListner: RecyclerViewClickListner) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is FoodViewHolder)
            holder.bindView(shopsList?.get(position)!!,shopClickListner)
    }

    override fun getItemCount(): Int {
            return shopsList!!.size
    }



    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(dataList: FoodsModel.ShopX?, shopClickListner: RecyclerViewClickListner) {
            itemView.ivShopImage.setImageURI(Uri.parse(dataList?.avatar!!))
            itemView.tvShopName.text = dataList!!.name
            itemView.tvShopemail.text = dataList!!.email
            itemView.tvPhone.text = dataList!!.phone

            itemView.setOnClickListener {
                shopClickListner.onItemClick(dataList)
            }
        }
    }
}