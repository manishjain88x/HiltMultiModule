package com.medocity.andorid_framework

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LibOneActivity : AppCompatActivity() {
    @Inject
    lateinit var libOneModel: LibOneModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib_one)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            if (::libOneModel.isInitialized) {
                Toast.makeText(this, libOneModel.getMessage(), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "not initialize", Toast.LENGTH_LONG).show()
            }
        }

        //Toast.makeText(this, myTestHilt.showMessage(), Toast.LENGTH_LONG).show()
    }
}