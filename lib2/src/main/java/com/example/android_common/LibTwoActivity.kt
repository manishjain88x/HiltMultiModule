package com.example.android_common

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android_common.R.*
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LibTwoActivity : AppCompatActivity() {
    @Inject
    lateinit var libTwoModel: LibTwoModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_lib2)

        val btn=findViewById<Button>(id.mybtn)
        btn.setOnClickListener {
            if (::libTwoModel.isInitialized) {
                Toast.makeText(this, libTwoModel.getMessage(), Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "not initialzied", Toast.LENGTH_SHORT).show()
            }
        }


        // DaggerFrameWorkComponent.create().getMyModule().showMessage()

    }
}