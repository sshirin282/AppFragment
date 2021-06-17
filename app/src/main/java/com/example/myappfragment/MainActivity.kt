package com.example.myappfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.nav)
        val fragment = SecondFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
        true
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.setting -> {
//                    val intent=Intent(this,MainActivity2::class.java)
//                    startActivity(intent)
                    val fragment = SecondFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
                    true
                }
                R.id.Home -> {
                    val fragment = FirstFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
////                    val intent=Intent(this,MainActivity2::class.java)
////                    startActivity(intent)
                    true
                }
                R.id.Exit -> {
////                    val fragment = BlankFragment()
////                    supportFragmentManager.beginTransaction().replace(R.id.fram, fragment).commit()
////                    val intent=Intent(this,MainActivity2::class.java)
////                    startActivity(intent)
                    true
//                }
                }
            }
        }
    }
}