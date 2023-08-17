package com.kotlin.library

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val list:ArrayList<booklist> ) :RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    class BookViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val bookimage:ImageView=itemView.findViewById(R.id.IVimage)
        val booktitle:TextView=itemView.findViewById(R.id.TVtitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val viewlayout =LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return BookViewHolder(viewlayout)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val currentitem = list[position]
        holder.bookimage.setImageResource(currentitem.bookimage)
        holder.booktitle.text=currentitem.booktitle

        holder.itemView.setOnClickListener{
            //onItemClick(currentitem)
            val i = Intent(holder.itemView.context,HomeActivity::class.java)
            i.putExtra("image",currentitem.bookimage)
            i.putExtra("title",currentitem.booktitle)
            holder.itemView.context.startActivity(i)


        }
    }

}