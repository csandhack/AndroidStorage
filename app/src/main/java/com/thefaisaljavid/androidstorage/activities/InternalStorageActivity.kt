package com.thefaisaljavid.androidstorage.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thefaisaljavid.androidstorage.databinding.ActivityInternalStorageBinding

class InternalStorageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInternalStorageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInternalStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

        }
    }
}