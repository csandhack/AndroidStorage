package com.thefaisaljavid.androidstorage.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thefaisaljavid.androidstorage.databinding.ActivityScopeStorageBinding

class ScopeStorageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScopeStorageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScopeStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

        }
    }
}