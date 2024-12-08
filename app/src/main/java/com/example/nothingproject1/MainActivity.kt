package com.example.nothingproject1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : Activity() {
    private var isFlashOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            if (!isFlashOn) {
                val flashlight = Flashlight(this)
                flashlight.turnOn()
                isFlashOn = true
                btn.text = "ON"
                btn.background.setTint(getColor(R.color.green))
            } else {
                val flashlight = Flashlight(this)
                flashlight.turnOff()
                isFlashOn = false
                btn.text = "OFF"
                btn.background.setTint(getColor(R.color.red))
            }
        }
    }
}