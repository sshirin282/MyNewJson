package com.example.mynewjson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter4(val context: Context,val list: List<Datamodel2>):RecyclerView.Adapter<adapter4.ViewHolder>() {

    private val inflater=context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater


    class ViewHolder (view: View):RecyclerView.ViewHolder(view){
        val userId:TextView=view.findViewById(R.id.list2text1)
        val id:TextView=view.findViewById(R.id.list2text2)
        val title:TextView=view.findViewById(R.id.list2text3)
        val completed:TextView=view.findViewById(R.id.list2text4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val rowView=inflater.inflate(R.layout.list2,parent,false)
        return ViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text=list.get(position).id
        holder.title.text=list.get(position).title
        holder.userId.text=list.get(position).userId
        holder.completed.text=list.get(position).completed
    }

    override fun getItemCount(): Int {
       return list.size
    }
}