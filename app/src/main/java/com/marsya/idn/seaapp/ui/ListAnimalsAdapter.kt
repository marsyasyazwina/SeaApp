package com.marsya.idn.seaapp.ui

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.marsya.idn.seaapp.R
import com.marsya.idn.seaapp.data.AnimalsData
import com.squareup.picasso.Picasso

class ListAnimalsAdapter (private val listAnimals: ArrayList<AnimalsData>) : RecyclerView.Adapter<ListAnimalsAdapter.ListVierHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListVierHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_animals_name)
        var tvFood: TextView = itemView.findViewById(R.id.tv_animals_food)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListVierHolder {
       val view: View = LayoutInflater.from(viewGroup.context)
           .inflate(R.layout.item_row_animal, viewGroup, false)
        return ListVierHolder(view)
    }

    override fun onBindViewHolder(holder: ListVierHolder, position: Int) {
        val animals = listAnimals[position]

        animals.photo?.let{
            Picasso.with(holder.itemView.context)
                .load(it)
                .resize(50,50)
                .into(holder.imgPhoto)
        }
        holder.tvName.text = animals.Name
        holder.tvFood.text = animals.Food
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClickedData (listAnimals[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return  listAnimals.size
    }

    interface OnItemClickCallback {
        fun onItemClickedData(data: AnimalsData)

    }

}


