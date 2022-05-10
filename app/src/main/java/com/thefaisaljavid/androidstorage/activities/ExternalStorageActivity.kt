package com.thefaisaljavid.androidstorage.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thefaisaljavid.androidstorage.databinding.ActivityExternalStorageBinding

class ExternalStorageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExternalStorageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExternalStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

        }
    }
}