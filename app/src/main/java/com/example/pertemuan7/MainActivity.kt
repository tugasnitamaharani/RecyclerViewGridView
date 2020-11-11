package com.example.pertemuan7

import android.graphics. BitmapFactory
import androidx.appcompat.app. AppCompatActivity
import android.os. Bundle
import androidx.recyclerview.widget. GridLayoutManager
import androidx.recyclerview.widget. RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    val CarList: ArrayList<CarModel> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CarList.add(
            CarModel(
                "Mini Cooper",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon1
                )
            )
        )
        CarList.add(
            CarModel(
                "BMW",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon2
                )
            )
        )
        CarList.add(
            CarModel(
                "Mercedes Benz",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon3
                )
            )
        )
        CarList.add(
            CarModel(
                "Mini Cooper Super",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon4
                )
            )
        )
        CarList.add(
            CarModel(
                "BMW",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon5
                )
            )
        )
        CarList.add(
            CarModel(
                "Mercedes Benz Super Classic",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon6
                )
            )
        )
        CarList.add(
            CarModel(
                "BMW Super",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon7
                )
            )
        )
        layoutManager = GridLayoutManager(this, 3)
        rvCarList.layoutManager = layoutManager
        rvCarList.adapter = RecyclerViewAdapter(this, CarList)
    }
}
