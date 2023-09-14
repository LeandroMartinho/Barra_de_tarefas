package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId){
                R.id.nav_home -> {
                    Toast.makeText(this@MainActivity, "Item Home selecionado", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(intent)

                    true
                }
                R.id.nav_search -> {
                    Toast.makeText(this@MainActivity, "Item Search selecionado", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_notifications -> {
                    Toast.makeText(this@MainActivity, "Item Notifications selecionado", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_profile -> {
                    Toast.makeText(this@MainActivity, "Item Profile selecionado", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}