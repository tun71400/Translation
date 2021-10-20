package edu.temple.imageactivityproject

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(var context: Context) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    var dataList = emptyList<ChampData>()

    internal fun setDataList(dataList: List<ChampData>) {
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

            val intent = Intent(context, ActivitySecond::class.java).apply {
                putExtra("title", data.title )
                putExtra("image", data.image )
            }
            context.startActivity(intent)


            /* might need later
            (context as Activity).findViewById<ImageView>(R.id.mainImage).setImageResource(data.image)
            (context as Activity).findViewById<TextView>(R.id.name).text = data.title */
        }
    }

    override fun getItemCount() = dataList.size
}