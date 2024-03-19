package com.androiddevelopers.socialmediaappdemo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.androiddevelopers.socialmediaappdemo.MainActivity
import com.androiddevelopers.socialmediaappdemo.databinding.ActivityEntryBinding

class EntryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEntryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnEnty.setOnClickListener{
            val mail = binding.etMail.text.toString()
            val password = binding.etPass.text.toString()
            if (mail.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "lütfen kullanıcı adınızı ve şifrenizi girin", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this,MainActivity::class.java)
            finish()
            startActivity(intent)
        }

    }
}