package com.example.fragmenttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragement = SecondFragement()

        buttonFragmentOne.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()
            }
        }

        buttonFragmentTWO.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragement)
                addToBackStack(null)
                commit()
            }
        }
    }
}