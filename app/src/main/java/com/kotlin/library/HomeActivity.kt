package com.kotlin.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val image = intent.getIntExtra("image",R.drawable.book)
        val title = intent.getStringExtra("title")

       val titleTV:TextView=findViewById(R.id.idTVTitle)
        titleTV.text=title
        val imageIV:ImageView=findViewById(R.id.idIVbook)
        imageIV.setImageResource(image)
        }
    }
