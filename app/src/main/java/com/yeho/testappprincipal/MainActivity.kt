package com.yeho.testappprincipal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         btnOpen.setOnClickListener(View.OnClickListener {
             Log.wtf("YEHO", "llendo a la activity en modulo")
             try {
                 intent = Intent(this, Class.forName("com.yeho.testlibrary.MainActivity"))
                 startActivity(intent)
             } catch (e: ClassNotFoundException) {
                 e.printStackTrace()
             }
             catch (e: Exception) {
                 e.printStackTrace()
             }
         })
    }
}
