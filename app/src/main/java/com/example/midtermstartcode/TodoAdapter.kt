package com.example.midtermstartcode

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class TodoAdapter(
    private val todos: MutableList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Todo: Uncomment the code below, and make the changes (5 Points)

//        private val textTitle: TextView = itemView.findViewById(R.id.<Todo: id of the element>)
//        private val textDescription: TextView = itemView.findViewById(R.id.<Todo: id of the element>)
//        private val checkBoxDone: CheckBox = itemView.findViewById(R.id.<Todo: id of the element>)
//
        fun bind(todo: Todo) {
//            textTitle.text = todo.title
//            textDescription.text = todo.description
//            checkBoxDone.isChecked = todo.isDone
//            toggleStrikeThrough(textTitle, todo.isDone)
//
//            checkBoxDone.setOnCheckedChangeListener { _, isChecked ->
//                todo.isDone = isChecked
//                toggleStrikeThrough(textTitle, isChecked)
//            }
        }
//
//        private fun toggleStrikeThrough(textView: TextView, isDone: Boolean) {
//            if (isDone) {
//                textView.paintFlags = textView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
//            } else {
//                textView.paintFlags = textView.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
//            }
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todos[position])
    }

    override fun getItemCount(): Int = todos.size

}

// This Page has a total of 5 Points.