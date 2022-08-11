package com.marsya.idn.seaapp.ui

import android.graphics.Picture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.marsya.idn.seaapp.R

class UserActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHOTO = "extra_photo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val ivPhotoReceived: ImageView = findViewById(R.id.iv_profile)
        val tvUsernameReceived: TextView = findViewById(R.id.tv_username)
        val tvEmailReceived: TextView = findViewById(R.id.tv_email)

        val username = intent.getStringExtra(EXTRA_USERNAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        ivPhotoReceived.setImageResource(photo)
        tvUsernameReceived.text = username
        tvEmailReceived.text = email
    }
}