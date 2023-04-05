package com.milab.yourstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            // first activity
        //let user choose between buying and selling.

        btnBuy.setOnClickListener {

            val intent = Intent(this,ListActivity::class.java)

            startActivity(intent)
            finish()
        }


        btnSell.setOnClickListener {

            val intent = Intent(this,LoginActivity::class.java)

            startActivity(intent)
        }
    }




}