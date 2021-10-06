package edu.temple.imageactivityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



         var imageAdapter: ImageAdapter = ImageAdapter(this)
         var dataList = mutableListOf<ChampData>()

        champRecycler.layoutManager = GridLayoutManager(this,2)
        champRecycler.adapter = imageAdapter

        dataList.add(ChampData("Ahri","Mage that goes mid",R.drawable.ahri))
        dataList.add(ChampData("Ashe","ADC that goes bottom",R.drawable.ashe))
        dataList.add(ChampData("Dr. Mundo","Tank that goes top",R.drawable.dr_mundo))
        dataList.add(ChampData("Garen","Tank that goes top",R.drawable.garen))
        dataList.add(ChampData("Morgana","Support that goes bottom",R.drawable.morgana))
        dataList.add(ChampData("Sett","Bruiser that goes top",R.drawable.sett))
        dataList.add(ChampData("Shen","Tank that goes top",R.drawable.shen))
        dataList.add(ChampData("Soraka","Support that goes bottom",R.drawable.soraka))
        dataList.add(ChampData("Viego","Assassin that goes jungle",R.drawable.viego))
        dataList.add(ChampData("Yone","ADC that goes top",R.drawable.yone))
        imageAdapter.setDataList(dataList)


    }

}
