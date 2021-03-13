package com.neppplus.loginkotlintest_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       loginBtn.setOnClickListener {

           val inputId = IDEdt.text.toString()
           val inputPw = pwEdt.text.toString()

           if(inputId == "admin" && inputPw == "qwer")
           {

               Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()

           }

           else {
               Toast.makeText(this,"로그인 실패", Toast.LENGTH_SHORT).show()
           }





       }



    }
}