package com.kotlin.library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //here we need a layout manager and adapter

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager=LinearLayoutManager(this)
        // recyclerview.layoutManager=GridLayoutManager(this,3)

        val listdata = ArrayList<booklist>()
        listdata.add(booklist(R.drawable.book,"The Cruel Prince"))
        listdata.add(booklist(R.drawable.redqueen,"Red Queen"))
        listdata.add(booklist(R.drawable.poppybookimage,"The Poppy War"))
        listdata.add(booklist(R.drawable.uprootedbookimage,"Uprooted"))
        listdata.add(booklist(R.drawable.thegirlbookimage,"The Girl Who Fell Beneath the Sea"))
        listdata.add(booklist(R.drawable.moonbookimage,"Daughter of the Moon Goddess"))

        /**val adapter = BookAdapter(listdata){selectedIem->
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }*/
        val adapter = BookAdapter(listdata)
        recyclerview.adapter=adapter
        //recyclerview,listdata,adapter..THESE ARE VARIABLE NAMES
        //variable name recyclerview.adapter =variable name adapter
        //OR (variable name) recyclerview.adapter =Adapter(this,(variable name) listdata)
    }
}