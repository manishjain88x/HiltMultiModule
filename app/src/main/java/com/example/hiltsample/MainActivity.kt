package com.example.hiltsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_common.LibTwoActivity
import com.example.hiltsample.databinding.ActivityMainBinding
import com.medocity.andorid_framework.LibOneActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //DaggerFrameWorkComponent.create().getMyModule().showMessage()
        binding.btn.setOnClickListener {
            //Toast.makeText(this, getString(R.string.BASE_URL), Toast.LENGTH_LONG).show()
            startActivity(Intent(this, LibOneActivity::class.java))
        }
        /*
        LibTwoActivity not instantiated LibTwoModel
        *
        */

        binding.btn2.setOnClickListener {
            //Toast.makeText(this, getString(R.string.BASE_URL), Toast.LENGTH_LONG).show()
            startActivity(Intent(this, LibTwoActivity::class.java))
        }
    }
}