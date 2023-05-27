package com.example.recotivapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class splashscreen : AppCompatActivity() {

    private lateinit var img_load:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        img_load = findViewById(R.id.imgSplash)

        supportActionBar?.hide()

        setAnimation()

        Handler().postDelayed({
            startActivity(Intent(this@splashscreen,LoginActivity::class.java))
        }, 5000)
    }

    private fun setAnimation(){
        val animation = AnimationUtils.loadAnimation(this,R.anim.animation)
        img_load.animation = animation
    }
}