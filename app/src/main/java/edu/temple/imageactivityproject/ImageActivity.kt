package edu.temple.imageactivityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         val champs = resources.getStringArray(R.array.champs)

         var imageAdapter: ImageAdapter = ImageAdapter(this)
         var dataList = mutableListOf<ChampData>()

        champRecycler.layoutManager = GridLayoutManager(this,2)
        champRecycler.adapter = imageAdapter

        dataList.add(ChampData("some",champs[0],R.drawable.ahri))
        dataList.add(ChampData("some",champs[1],R.drawable.ashe))
        dataList.add(ChampData("some",champs[2],R.drawable.dr_mundo))
        dataList.add(ChampData("some",champs[3],R.drawable.garen))
        dataList.add(ChampData("some",champs[4],R.drawable.morgana))
        dataList.add(ChampData("some",champs[5],R.drawable.sett))
        dataList.add(ChampData("some",champs[6],R.drawable.shen))
        dataList.add(ChampData("some",champs[7],R.drawable.soraka))
        dataList.add(ChampData("some",champs[8],R.drawable.viego))
        dataList.add(ChampData("some",champs[9],R.drawable.yone))
        imageAdapter.setDataList(dataList)


    }

}
