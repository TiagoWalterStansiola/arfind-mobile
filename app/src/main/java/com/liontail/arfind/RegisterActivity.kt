package com.liontail.arfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnContinuarRegister = findViewById<Button>(R.id.btn_register_confirmar)

        btnContinuarRegister.setOnClickListener{
            val intent = Intent(this, ConfirmationCodeActivity::class.java)
            startActivity(intent)
            finish()
        }





    }
}