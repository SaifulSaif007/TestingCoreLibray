package com.saiful.testlib


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saiful.core_lib.CoreActivity
import com.saiful.customlist.ListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this,  CoreActivity::class.java))
    }
}