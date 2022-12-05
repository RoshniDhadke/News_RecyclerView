package com.example.news_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val imagenews:ImageView=findViewById(R.id.imagenews)
        val headingnews:TextView=findViewById(R.id.title)
        val descnews:TextView=findViewById(R.id.desc)

        val bundle:Bundle?=intent.extras
        val heading=bundle!!.getString("heading")
        val image=bundle!!.getInt("image")
        val desc=bundle!!.getString("desc")
    /*    val intent=intent
        val a=intent.getStringExtra("heading")
        headingnews.text=a
        val c=intent.getIntExtra("image",2)
      imagenews.setImageResource(c)
        val b=intent.getStringExtra("desc")
        descnews.text=b */


        headingnews.text=heading
        descnews.text=desc
        imagenews.setImageResource(image)
    }
}