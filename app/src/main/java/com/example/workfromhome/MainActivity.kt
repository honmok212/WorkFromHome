package com.example.workfromhome

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun addImage(view: View) {
        findViewById<TextView>(R.id.randomtext).setText("add image")
        val getIntent = Intent(Intent.ACTION_GET_CONTENT)
        getIntent.setType("image/*")
        val chooserIntent =  Intent.createChooser(getIntent, "Select Image")
        val pickIntent = Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayOf(pickIntent))
        startActivityForResult(chooserIntent, 1)
    }
}