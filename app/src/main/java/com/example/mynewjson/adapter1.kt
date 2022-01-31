package com.example.mynewjson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class adapter1(val context: Context, val list:List<DataModel1>):RecyclerView.Adapter<adapter1.ViewHolder>() {

    private val inflater: LayoutInflater=context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

    class ViewHolder (view:View):RecyclerView.ViewHolder(view){
        val textView:TextView=view.findViewById(R.id.list1text)
        val imageView:ImageView=view.findViewById(R.id.list1mage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rowView=inflater.inflate(R.layout.list1,parent,false)
        return ViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text=list.get(position).name
        Glide.with(context).load(list.get(position).imageurl)
            .into(holder.imageView)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}