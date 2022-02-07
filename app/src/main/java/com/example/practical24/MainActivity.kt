package com.example.practical24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical24.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val s: Student = Student("W123", "John")

        binding.myData = s

        //binding.tvID.text = s.studentID

        //binding.tvID.text = "W123456"
        //binding.tvID.text = "W123456"

        binding.btnUpdate.setOnClickListener(){
            s.studentName = "Alex"

            binding.apply {
                invalidateAll()
            }
        }
    }
}