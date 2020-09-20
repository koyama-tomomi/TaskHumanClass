package jp.techacademy.tomomi.taskhumanclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human2 =Human("tomomi", 24)
        human2.hobby="散歩"

        human2.say()  // ポチが吠えます（ログ出力）


        human2.think()
    }

}
