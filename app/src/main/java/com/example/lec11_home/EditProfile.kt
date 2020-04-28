package com.example.lec11_home

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.activity_main.*

class EditProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        init()
    }

    private fun init(){
        btnSaveProfile.setOnClickListener{
            saveProfile()
        }
    }

    private fun saveProfile(){
        val intent = intent
        intent.putExtra("firstName", etFirstName.text.toString())
        intent.putExtra("lastName", etLastName.text.toString())
        intent.putExtra("email", etEmail.text.toString())
        intent.putExtra("age", etAge.text.toString())
        intent.putExtra("gender", etGender.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
