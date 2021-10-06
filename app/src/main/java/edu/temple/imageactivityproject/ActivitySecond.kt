package edu.temple.imageactivityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ActivitySecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val title = intent.getStringExtra("title")
        val image = intent.getIntExtra("image", R.drawable.ahri)

        findViewById<ImageView>(R.id.imageView).setImageResource(image)
        findViewById<TextView>(R.id.textView).text = title
    }
}