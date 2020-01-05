package com.geektech.myimageview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

@SuppressLint("Registered")
class MainActivity : AppCompatActivity() {

    private lateinit var img: ImageView
    private var num: Int = 0
    val imageURLS = mutableListOf("https://namobilu.com/u/img/ib/238/128/128238-1.jpg",
        "https://bipbap.ru/wp-content/uploads/2017/07/109c2cbe5bfbeb32a48fad5a550b24c6.jpg",
        "https://srca.oboi.ws/wallpapers/big_12090_oboi_priroda.jpg",
        "https://wallpaperscave.ru/images/thumbs/wp-preview/800x500/18/08-27/artistic-nature-79550.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMW70f_0xeLY298rtBrEGKT2x7RZUBJc3NpVvoPaG9gtEQR5HYPA&s",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgUJkZHATNnkq2iJ5MHEF05NUWYKSJfsAE2NAYXBWfTs4MqI5tJA&s"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.image_View)
        loadImage(imageURLS)
    }

    private fun loadImage(mutableList: MutableList<String>) {
        btnNext.setOnClickListener {
            btnBack.visibility = View.VISIBLE
            if (num<mutableList.lastIndex) {
                num++
                Picasso.get().load(mutableList[num]).into(image_View)
            }else{
                btnNext.visibility = View.INVISIBLE
            }
        }
        btnBack.setOnClickListener {
            btnNext.visibility = View.VISIBLE
            if (num>0){
                num--
                Picasso.get().load(mutableList[num]).into(image_View)
            } else{
                btnBack.visibility= View.INVISIBLE
            }
        }
    }


}
