package com.anomdev.familydashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        choosePerson ()
    }

    fun choosePerson (){
            rebecaBtn.setOnClickListener {
                val context = applicationContext
                val intentToBioActivity = Intent(context, BioActivity::class.java)
                startActivity(intentToBioActivity)

            }
    }



}