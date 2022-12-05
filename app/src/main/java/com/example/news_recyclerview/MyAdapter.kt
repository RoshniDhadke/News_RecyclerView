package com.example.news_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val newsList:List<dataClass>,val listener:MyonItemClickListener): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
     val image:ImageView=itemView.findViewById(R.id.image)
        val heading:TextView=itemView.findViewById(R.id.heading)
        init {
            itemView.setOnClickListener {
               listener.onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data=newsList[position]
        holder.image.setImageResource(data.image)
        holder.heading.text=data.heading
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    interface MyonItemClickListener{
        fun onClick(position: Int)
    }
}