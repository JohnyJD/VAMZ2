package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.buttonToast),
                Toast.LENGTH_SHORT
            ).show()
        }
        val hey : Int = 100;
        val hey2 : Int = 100;
    }
}