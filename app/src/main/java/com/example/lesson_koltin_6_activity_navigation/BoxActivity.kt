package com.example.lesson_koltin_6_activity_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.lesson_koltin_6_activity_navigation.databinding.ActivityBoxBinding

class BoxActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBoxBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoxBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.toMainMenuButton.setOnClickListener {onToMainMenuPressed() }
    }

    private fun    onToMainMenuPressed() {
        val intent = Intent( this, MenuActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}