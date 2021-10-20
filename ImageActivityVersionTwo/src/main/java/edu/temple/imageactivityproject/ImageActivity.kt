package edu.temple.imageactivityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         val champs = resources.getStringArray(R.array.champs)
        val champNames = resources.getStringArray(R.array.champNames)
        findViewById<TextView>(R.id.infoText).text = resources.getString(R.string.info)

         var imageAdapter: ImageAdapter = ImageAdapter(this)
         var dataList = mutableListOf<ChampData>()

        champRecycler.layoutManager = GridLayoutManager(this,2)
        champRecycler.adapter = imageAdapter

        dataList.add(ChampData(champNames[0],champs[0],R.drawable.ahri))
        dataList.add(ChampData(champNames[1],champs[1],R.drawable.ashe))
        dataList.add(ChampData(champNames[2],champs[2],R.drawable.dr_mundo))
        dataList.add(ChampData(champNames[3],champs[3],R.drawable.garen))
        dataList.add(ChampData(champNames[4],champs[4],R.drawable.morgana))
        dataList.add(ChampData(champNames[5],champs[5],R.drawable.sett))
        dataList.add(ChampData(champNames[6],champs[6],R.drawable.shen))
        dataList.add(ChampData(champNames[7],champs[7],R.drawable.soraka))
        dataList.add(ChampData(champNames[8],champs[8],R.drawable.viego))
        dataList.add(ChampData(champNames[9],champs[9],R.drawable.yone))
        imageAdapter.setDataList(dataList)


    }

}
