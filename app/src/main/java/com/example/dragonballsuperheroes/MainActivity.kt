package com.example.dragonballsuperheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dragonballsuperheroes.databinding.ActivityMainBinding
import com.smarteist.autoimageslider.SliderView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    lateinit var imageUrl: ArrayList<String>

    lateinit var sliderView: SliderView


    lateinit var sliderAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            sliderView = findViewById(R.id.slider)

            imageUrl = ArrayList()

            imageUrl =
                (imageUrl + "https://i.blogs.es/052ae3/dragon-ball-super-super-hero/840_560.jpg") as ArrayList<String>
            imageUrl =
                (imageUrl + "https://cnnespanol.cnn.com/wp-content/uploads/2022/08/DBSSH-5.png") as ArrayList<String>
            imageUrl =
                (imageUrl + "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/hc_1440x810/public/media/image/2022/05/dragon-ball-super-super-hero-desvelada-edad-pan-nueva-pelicula-akira-toriyama-2709719.jpg?itok=yYQSY951") as ArrayList<String>

            sliderAdapter = SliderAdapter( imageUrl)

            sliderView.autoCycleDirection = SliderView.LAYOUT_DIRECTION_LTR

            sliderView.setSliderAdapter(sliderAdapter)

            sliderView.scrollTimeInSec = 3

            sliderView.isAutoCycle = true

            sliderView.startAutoCycle()

            val intent = Intent(this, MenuActivity::class.java)

        binding.btncontinuar.setOnClickListener {
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right)
        }
    }
}