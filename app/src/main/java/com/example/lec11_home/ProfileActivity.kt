package com.example.lec11_home

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.activity_main.*

class ProfileActivity : AppCompatActivity() {

    private val REQUEST_CODE = 14
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        btnEditProfile.setOnClickListener(){
            editProfile()
        }
    }

    private fun editProfile(){
        val intent = Intent(this, EditProfile::class.java)
        startActivityForResult(intent, REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == this.REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            tvFirst.text = data!!.extras!!.getString("firstName", "")
            tvLast.text = data.extras!!.getString("lastName", "")
            tvEmail.text = data.extras!!.getString("email", "")
            tvAge.text = data.extras!!.getString("age", "")
            tvGender.text = data.extras!!.getString("gender", "")
        }
    }
}
