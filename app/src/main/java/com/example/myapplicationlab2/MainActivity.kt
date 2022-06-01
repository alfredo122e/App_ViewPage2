package com.example.myapplicationlab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Desliza hacia la derecha para obtener mayor información.", Toast.LENGTH_SHORT).show()


        mapa.setOnClickListener {

            val intento1 = Intent(this, MapsActivity::class.java)
            startActivity(intento1)
        }
        setupViewPager2()
    }

    private fun setupViewPager2() {
        val list: MutableList<String> = ArrayList()
        list.add("Sobre mí. ")
        list.add("Mapa de El Salvador. ")


        val list2: MutableList<String> = ArrayList()
        list2.add("Mi nombre es Alfredo José Zelaya Lainez, tengo 19 años, soy estudiante de la carrera de ingeniería en sistemas y redes informáticas ❤️ tengo 19 años de edad me gusta la programación, el basquet, la música, hacer amigos, actividades al aire libre, entre otras.")
        list2.add("Se muestra la ubicación exacta de la Universidad Gerardo Barrios.")


        // Set adapter to viewPager.
        viewPager.adapter = ViewPagerAdapter(this, list, list2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.info-> {
                val intent = Intent(this, Information::class.java)
                startActivity(intent)
                // using finish() to end the activity
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}