package com.example.quizapp


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView


class RoutineAdapter(
    val context: Context,
    val routineList: MutableList<String>,
    val listener: MainActivity
) : RecyclerView.Adapter<RoutineAdapter.RoutineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutineViewHolder {
        val inflater = LayoutInflater.from(context)
        val view1: View = inflater.inflate(R.layout.item_layout, parent, false)
        return RoutineViewHolder(view1)

    }

    override fun onBindViewHolder(holder: RoutineViewHolder, position: Int) {
        val task = routineList.get(position)
        //holder.title.text = task.title
        //holder.desc.text = task.desc

        /*holder.editTv.setOnClickListener {
            listener.onEditClicked(task)
        }

        holder.delete.setOnClickListener {
            listener.onDeleteClicked(task)
        }*/

    }

    override fun getItemCount(): Int {
        return routineList.size
    }


    class RoutineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // var title: TextView
        //var desc: TextView

        //var editTv: TextView
        //var delete: TextView

        init {
           // title = itemView.findViewById(R.id.titleTv)
            //desc = itemView.findViewById(R.id.tvDesc)
            //editTv = itemView.findViewById(R.id.editTv)
            //delete = itemView.findViewById(R.id.deleteTv)
        }
    }
}