package com.thefaisaljavid.androidstorage.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.thefaisaljavid.androidstorage.databinding.ActivityExternalStorageBinding

class ExternalStorageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExternalStorageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExternalStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.title = "External Storage";

        binding.apply {

        }
    }
}