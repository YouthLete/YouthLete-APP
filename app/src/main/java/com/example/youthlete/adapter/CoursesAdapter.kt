package com.example.youthlete.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.youthlete.R
import com.example.youthlete.model.Course

class CoursesAdapter(private val coursesList: List<Course>) :
    RecyclerView.Adapter<CoursesAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.tv_item_name)

        fun bind(course: Course) {
            nameTextView.text = course.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = coursesList[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int {
        return coursesList.size
    }
}