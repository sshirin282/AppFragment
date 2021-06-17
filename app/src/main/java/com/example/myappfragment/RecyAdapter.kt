package com.example.myappfragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyAdapter (val context: Context?, val name:Array<String>, val des:Array<String>, val image:Array<Int>)
    : RecyclerView.Adapter<RecyAdapter.ViewHolder>() {

    private  val inflater: LayoutInflater
            =context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater


    class ViewHolder (view: View): RecyclerView.ViewHolder(view){
        val textView: TextView =view.findViewById(R.id.text6)
        val textView2: TextView =view.findViewById(R.id.text7)
        val image1: ImageView =view.findViewById(R.id.image6)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyAdapter.ViewHolder {
        val rowView=inflater.inflate(R.layout.list1, parent, false)
        return ViewHolder(rowView)
    }


    override fun getItemCount(): Int {
        return name.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = name[position]
        holder.textView2.text=des.get(position)
        holder.image1.setImageResource(image[position])

    }
}
