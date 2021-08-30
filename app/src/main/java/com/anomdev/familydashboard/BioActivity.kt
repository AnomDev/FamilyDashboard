package com.anomdev.familydashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bio.*
import kotlinx.android.synthetic.main.activity_main.*

class BioActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)
        chooseAge()
    }

    fun chooseAge (){
        btnPersonChosenBabyGrid.setOnClickListener {
            val context = applicationContext
            val intentToBioActivity = Intent(context, PicturesGridActivity::class.java)
            startActivity(intentToBioActivity)

        }
    }

}