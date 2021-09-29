package edu.temple.imageactivityproject

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(var context: Context) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    var dataList = emptyList<champData>()

    internal fun setDataList(dataList: List<champData>) {
        this.dataList = dataList
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView
        var desc: TextView

        init {
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
            desc = itemView.findViewById(R.id.desc)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var data = dataList[position]

        holder.title.text = data.title
        holder.desc.text = data.desc

        holder.image.setImageResource(data.image)

        holder.image.setOnClickListener(){
            (context as Activity).findViewById<ImageView>(R.id.mainImage).setImageResource(data.image)
            (context as Activity).findViewById<TextView>(R.id.name).text = data.title
        }
    }

    override fun getItemCount() = dataList.size
}