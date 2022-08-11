package com.marsya.idn.seaapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.marsya.idn.seaapp.R

class DetailAnimalsActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_FOOD = "extra_food"
        const val EXTRA_DESCRIPTION = "extra_description"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_animals)

        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showAnimalsDetail()
    }

    private fun showAnimalsDetail() {
        // variabel untuk menampung id layout
        val tvImageReceived: ImageView = findViewById(R.id.iv_item_photo)
        val tvNameReceived: TextView = findViewById(R.id.tv_item_name)
        val tvFoodReceived: TextView = findViewById(R.id.tv_item_food)
        val tvDescriptionReceived: TextView = findViewById(R.id.tv_item_description)

        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val food = intent.getStringExtra(EXTRA_FOOD)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)

        tvImageReceived.setImageResource(photo)
        tvNameReceived.setText("$name")
        tvFoodReceived.setText("$food")
        tvDescriptionReceived.setText("$description")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}