package com.thefaisaljavid.androidstorage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thefaisaljavid.androidstorage.databinding.ActivityMainBinding
import com.thefaisaljavid.androidstorage.activities.ExternalStorageActivity
import com.thefaisaljavid.androidstorage.activities.InternalStorageActivity
import com.thefaisaljavid.androidstorage.activities.ScopeStorageActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnInternalStorage.setOnClickListener {
                startActivity(Intent(this@MainActivity, InternalStorageActivity::class.java))
            }
            btnExternalStorage.setOnClickListener {
                startActivity(Intent(this@MainActivity, ExternalStorageActivity::class.java))
            }
            btnScopeStorage.setOnClickListener {
                startActivity(Intent(this@MainActivity, ScopeStorageActivity::class.java))
            }
        }

    }
}