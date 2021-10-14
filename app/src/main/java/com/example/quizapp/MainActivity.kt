package com.example.quizapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val quizList: MutableList<String> = mutableListOf()
    lateinit var mAdapter: RoutineAdapter
    lateinit var dbHandler: DatabaseHandler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        quizList.add("hello")
//        quizList.add("hello")
//        quizList.add("hello")
//        quizList.add("hello")

        mAdapter = RoutineAdapter(this, quizList, this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = mAdapter

        dbHandler = DatabaseHandler(this)

        btnCreate.setOnClickListener {
            dbHandler.insertRoutine("How Many states does india have", "32", "33","29","22")
        }

        btnUpdate.setOnClickListener {
            dbHandler.updateRoutine(1, "How Many district does karnataka have", "30", "33","29","22")
        }

        btnDelete.setOnClickListener {
            dbHandler.deleteRoutine(2)
        }
    }

}