package com.example.nothingproject1

import android.content.Context
import android.hardware.camera2.CameraManager

class Flashlight(context: Context) {
    private val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as CameraManager
    private val cameraId: String? = cameraManager.cameraIdList.firstOrNull()

    fun turnOn() {
        if (cameraId != null) {
            cameraManager.setTorchMode(cameraId, true)
        }
    }

    fun turnOff() {
        if (cameraId != null) {
            cameraManager.setTorchMode(cameraId, false)
        }
    }
}