package com.marsya.idn.seaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marsya.idn.seaapp.data.AnimalsData
import com.marsya.idn.seaapp.data.AnimalsDataObject
import com.marsya.idn.seaapp.ui.DetailAnimalsActivity
import com.marsya.idn.seaapp.ui.ListAnimalsAdapter
import com.marsya.idn.seaapp.ui.UserActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnimals: RecyclerView
    private var list: ArrayList<AnimalsData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAnimals = findViewById(R.id.rv_animals)
        rvAnimals.setHasFixedSize(true)
        list.addAll(AnimalsDataObject.listData)
        showRecylerlist()
    }

    private fun showRecylerlist() {
        rvAnimals.layoutManager = LinearLayoutManager(this)
        val listAnimalsAdapter = ListAnimalsAdapter(list)
        rvAnimals.adapter = listAnimalsAdapter

        listAnimalsAdapter.setOnItemClickCallback(object : ListAnimalsAdapter.OnItemClickCallback {
            override fun onItemClickedData(data: AnimalsData) {
                showSelectedAnimals(data)
            }

        })

    }

    private fun showSelectedAnimals(data: AnimalsData) {
        val detailAnimalsActivity =
            Intent(this@MainActivity, DetailAnimalsActivity::class.java).apply {
                putExtra(DetailAnimalsActivity.EXTRA_PHOTO, data.photo)
                putExtra(DetailAnimalsActivity.EXTRA_NAME, data.Name)
                putExtra(DetailAnimalsActivity.EXTRA_FOOD, data.Food)
                putExtra(DetailAnimalsActivity.EXTRA_DESCRIPTION, data.Description)

            }
        startActivity(detailAnimalsActivity)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }



    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.user_action -> {
                val moveIntent = Intent(this@MainActivity, UserActivity::class.java)
                moveIntent.putExtra(UserActivity.EXTRA_PHOTO, R.drawable.userk)
                moveIntent.putExtra(UserActivity.EXTRA_USERNAME, "Marsya syazwina")
                moveIntent.putExtra(UserActivity.EXTRA_EMAIL, "Marsyasyazwina196@gmail.com")
                startActivity(moveIntent)
            }
        }
    }
}


