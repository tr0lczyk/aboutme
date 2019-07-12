package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun uodateName(view: View){
        val editText: EditText = findViewById(R.id.nickNameEdit)
        val nickName: TextView = findViewById(R.id.nicknametext)
        nickName.visibility = View.VISIBLE
        nickName.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
    }

}
