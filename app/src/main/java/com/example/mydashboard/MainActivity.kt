package com.example.mydashboard
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2)

        initListener1()
        initListener2()

        pepesa.apply {

            progressMax = 100f
            setProgressWithAnimation(82f,1000)
            progressBarWidth = 5f
            backgroundProgressBarColor = 16
            progressBarColor = Color.WHITE

        }















    }

    private fun initListener1(){
        findViewById<View>(R.id.light).setOnClickListener {
            overridePendingTransition(0,0)
            startActivity(Intent(this, lightActivity::class.java))
        }


    }

    private fun initListener2() {
        findViewById<View>(R.id.akun).setOnClickListener {
            overridePendingTransition(0,0)
            startActivity(Intent(this, panelActivity::class.java))
        }

    }

}