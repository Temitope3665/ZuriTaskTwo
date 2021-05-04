package com.zuritasktwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<TextInputEditText>(R.id.enter_email)
        val password = findViewById<TextInputEditText>(R.id.enter_password)
        val login = findViewById<MaterialButton>(R.id.login_Btn)

        login.setOnClickListener {
            val inputEmail = email.text.toString().trim()
            val inputPassword = password.text.toString().trim()

            if (inputEmail.isEmpty() && inputPassword.isEmpty()) {
                Toast.makeText(this, "Input a valid mail", Toast.LENGTH_SHORT).show()
            }

            else if (inputEmail == "zuritwo@gmail.com" && inputPassword == "zuritwo") {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                Toast.makeText(this, "Successfully Logged in", Toast.LENGTH_SHORT).show()
            }

            else {
                Toast.makeText(this, "Incorrect email or password", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
