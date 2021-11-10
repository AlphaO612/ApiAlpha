package com.alphaste.apialpha

import android.app.Service
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class AdapterService (private val servicesList: ArrayList<Service>) :
    RecyclerView.Adapter<AdapterService.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return servicesList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title: TextView = itemView.findViewById(R.id.title)
        val nameOfServer: TextView = itemView.findViewById(R.id.nameOfServer)
        val status: ImageView = itemView.findViewById(R.id.statusOfService)

    }

}