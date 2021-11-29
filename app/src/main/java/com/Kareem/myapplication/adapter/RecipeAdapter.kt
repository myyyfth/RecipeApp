package com.Kareem.myapplication.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Kareem.myapplication.data.Recipes
import com.Kareem.myapplication.databinding.RowItemFoodBinding
import com.bumptech.glide.Glide as Glide

class RecipeAdapter(private val listRecipe: ArrayList<Recipes>) :
    RecyclerView.Adapter<RecipeAdapter.MyViewHolder>(){

    inner class MyViewHolder(val binding: RowItemFoodBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: RecipeAdapter.MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listRecipe[position]) {
                tvFood.text = name
                tvFoodCategory.text = category
                tvPriceFood.text = price

                //load image
                Glide.with(imgFood.context).load(photo).into(imgFood)
            }
        }
    }

    override fun getItemCount() = listRecipe.size
}