package com.example.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.usercenter.R
import kotlinx.android.synthetic.main.activity_reg.*
import org.jetbrains.anko.toast

class RegActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        button.setOnClickListener{
            toast("Hi there!");
        }
    }
}
