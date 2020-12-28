package com.example.help

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.help.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*
           data binding --> build.gradle 에 android 안에
           viewBinding
           {
           enabled = true
           }

           이거 해줘야 함
        */

        binding.dont.setOnClickListener{

            var sound = MediaPlayer.create(this,R.raw.tightrope)
            sound.start()
        }

        binding.call.setOnClickListener{
            val intentVal = Intent(Intent.ACTION_DIAL)
            intentVal.data= Uri.parse("tel:112")
            startActivity(intentVal)
        }
//        uri, databinding, mediaplayer 뭐 이런건 위에 import 해야 하는듯

    }
}