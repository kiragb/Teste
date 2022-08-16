package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = Calendar.getInstance().time

        var dateTimeFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault())
        tvDateTime.text = dateTimeFormat.format(date)

        dateTimeFormat = SimpleDateFormat("EEE, d MMM yyyy", Locale.getDefault())
        tvDate.text = dateTimeFormat.format(date)

        dateTimeFormat = SimpleDateFormat("K:mm a", Locale.getDefault())
        tvTime.text = dateTimeFormat.format(date)

        tvFullDateTime.text = date.toString()

    }
}