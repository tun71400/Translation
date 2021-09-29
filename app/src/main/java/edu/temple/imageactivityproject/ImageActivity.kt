package edu.temple.imageactivityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var imageAdapter: ImageAdapter = ImageAdapter(applicationContext)
         var dataList = mutableListOf<champData>()

        champRecycler.layoutManager = GridLayoutManager(applicationContext,2)
        champRecycler.adapter = imageAdapter

        dataList.add(champData("Ahri","Mage that goes mid",R.drawable.ahri))
        dataList.add(champData("Ashe","ADC that goes bottom",R.drawable.ashe))
        dataList.add(champData("Dr. Mundo","Tank that goes top",R.drawable.dr_mundo))
        dataList.add(champData("Garen","Tank that goes top",R.drawable.garen))
        dataList.add(champData("Morgana","Support that goes bottom",R.drawable.morgana))
        dataList.add(champData("Sett","Bruiser that goes top",R.drawable.sett))
        dataList.add(champData("Shen","Tank that goes top",R.drawable.shen))
        dataList.add(champData("Soraka","Support that goes bottom",R.drawable.soraka))
        dataList.add(champData("Viego","Assassin that goes jungle",R.drawable.viego))
        dataList.add(champData("Yone","ADC that goes top",R.drawable.yone))
        imageAdapter.setDataList(dataList)



    }

}
