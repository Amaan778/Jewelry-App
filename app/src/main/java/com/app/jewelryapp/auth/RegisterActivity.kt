package com.app.jewelryapp.auth

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.jewelryapp.R

class RegisterActivity : AppCompatActivity() {
    private lateinit var linear:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        linear=findViewById(R.id.linear_layout)

    }
}