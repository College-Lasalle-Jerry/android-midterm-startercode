package com.example.midtermstartcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Todo: declare recycler view, textview and FAB (Floating Action Button) (3 Points)


    // Todo: declare Todo Adapter (2 Points)

    // Todo: declare Todo List (Empty) (2 Points)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Todo: initialize recycler view, textview and FAB (Link the xml files) (3 Points)

        // Todo: initialize Todo Adapter (3 Points)

        // Todo: initialize Todo List (3 Points)

        // Todo: set recycler view adapter to Todo Adapter (5 Points)


        // Todo: add a click listener to the FAB (Floating Action Button) (2 Points)

    }


    private fun showAddTodoDialog(){

        // Todo: Complete the Method to show the Add Todo Dialog (7 Points)

        // Just uncomment the code below to see the dialog, and make the changes

//        val dialogView = LayoutInflater.from(this).inflate(R.layout.<Todo: id of the element>)
//        val editTitle = dialogView.findViewById<EditText>(R.id.<Todo: id of the element>)
//        val editDescription = dialogView.findViewById<EditText>(R.id.<Todo: id of the element>)
//
//        val dialog = AlertDialog.Builder(this)
//            .setTitle("Add Todo")
//            .setView(dialogView)
//            .setPositiveButton("Add") { _, _ ->
//                val title = editTitle.text.toString()
//                val description = editDescription.text.toString()
//                if (title.isNotEmpty() && description.isNotEmpty()) {
//                    val todo = Todo(title, description, false)
//                    todoList.add(todo)
//                    todoAdapter.notifyItemInserted(todoList.size - 1)
//                    toggleNoTodosMessage()
//                }
//            }
//            .setNegativeButton("Cancel", null)
//            .create()
//
//        dialog.show()

    }

    private fun toggleNoTodosMessage() {

        // Todo: Complete the Method to toggle the no todos message (5 Points)
    }
}

// This Files has a total of 35 Points.