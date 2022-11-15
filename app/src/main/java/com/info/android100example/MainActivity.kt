package com.info.android100example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var trans = supportFragmentManager.beginTransaction()
        trans.add(R.id.fragmentContainer,SplashScreen())
        trans.commit()

        trans = supportFragmentManager.beginTransaction()

        Handler(Looper.getMainLooper()).postDelayed({
            trans.replace(R.id.fragmentContainer,FragmentSecond())
            trans.commit()

        },2000)



    }
}