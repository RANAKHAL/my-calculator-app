package com.assignment.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splash.btn_calculator
import kotlinx.android.synthetic.main.activity_splash.et_name
import kotlinx.android.synthetic.main.activity_splash.tv_welcome

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        tv_welcome.text = getString(R.string.hello)

        btn_calculator.setOnClickListener{
            val name = et_name.text;
            if (name != null && name.isEmpty()) {
                Toast.makeText(this, getString(R.string.enter_name_msg), Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                intent.putExtra("myName", name.toString())
                startActivity(intent)
            }
        }
    }
}