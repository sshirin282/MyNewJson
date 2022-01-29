package com.example.mynewjson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class adapter3(val context: Context, val list: List<DataModel3>):RecyclerView.Adapter<adapter3.ViewHolder>(){

    private val inflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

    class ViewHolder (view: View):RecyclerView.ViewHolder(view) {
        val imageView:ImageView=view.findViewById(R.id.list3image)
        val id:TextView=view.findViewById(R.id.list3text1)
        val name:TextView=view.findViewById(R.id.list3text2)
        val status:TextView=view.findViewById(R.id.list3text3)
        val species:TextView=view.findViewById(R.id.list3text4)
        val type:TextView=view.findViewById(R.id.list3text5)
        val gender:TextView=view.findViewById(R.id.list3text6)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rowView=inflater.inflate(R.layout.list3,parent,false)
        return ViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text=list.get(position).id
        holder.name.text=list.get(position).name
        holder.status.text=list.get(position).status
        holder.species.text=list.get(position).species
        holder.type.text=list.get(position).type
        holder.gender.text=list.get(position).gender
        context?.let{
            Glide.with(it).load(list.get(position).image).into(holder.imageView)
        }


    }

    override fun getItemCount(): Int {
      return list.size
    }
}