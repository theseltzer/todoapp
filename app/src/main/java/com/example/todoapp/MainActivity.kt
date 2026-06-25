package com.example.todoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val tasks = mutableListOf<String>()
    private lateinit var adapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTaskInput = findViewById<EditText>(R.id.etTaskInput)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val rvTasks = findViewById<RecyclerView>(R.id.rvTasks)

        adapter = TaskAdapter(tasks) { position ->
            tasks.removeAt(position)
            adapter.notifyItemRemoved(position)
        }

        rvTasks.adapter = adapter
        rvTasks.layoutManager = LinearLayoutManager(this)

        btnAdd.setOnClickListener {
            val text = etTaskInput.text.toString().trim()
            if (text.isNotEmpty()) {
                tasks.add(text)
                adapter.notifyItemInserted(tasks.lastIndex)
                etTaskInput.text.clear()
            }
        }
    }
}
