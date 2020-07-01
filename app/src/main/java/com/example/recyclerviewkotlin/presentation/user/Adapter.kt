package com.example.recyclerviewkotlin.presentation.user

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.R
import com.example.recyclerviewkotlin.model.User

class Adapter (private val userList: List<User>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        bind(holder, position)
    }

    private fun bind(holder: ViewHolder, position: Int){
        val user: User = userList[position]
        holder.textViewName.text = user.name
        holder.textViewOccupation.text = user.occupation
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.textviewname) as TextView
        val textViewOccupation = itemView.findViewById(R.id.textviewoccupation) as TextView
    }
}