package com.example.myappfragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService

class customAdapter(context: Context?, val name:Array<String>, val image1:Array<Int>):BaseAdapter() {
    val inflater:LayoutInflater=context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView=inflater.inflate(R.layout.list, parent, false)
        val imageView:ImageView=rowView.findViewById(R.id.image5)
        val textView:TextView=rowView.findViewById(R.id.text5)

        textView.setText(name[position])
        imageView.setImageResource(image1[position])
        return rowView
    }

    override fun getItem(position: Int): Any {
       return name[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getCount(): Int {
        return name.size
    }
}