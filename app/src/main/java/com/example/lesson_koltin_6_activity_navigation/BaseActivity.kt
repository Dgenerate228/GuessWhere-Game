package com.example.lesson_koltin_6_activity_navigation

import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}
