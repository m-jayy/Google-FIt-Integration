package com.mohsin.quizappkotlin.UI.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mohsin.quizappkotlin.R

class Base : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}
