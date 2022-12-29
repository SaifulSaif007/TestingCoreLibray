package com.saiful.core_lib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.saiful.customlist.ListActivity

class CoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)

        val  button = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            startActivity(Intent(this,  ListActivity::class.java))
        }
    }
}