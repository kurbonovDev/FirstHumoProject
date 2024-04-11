package com.example.firsthumoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.firsthumoproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onResume() {
        super.onResume()

        binding.button2.setOnClickListener {

            val t1 = binding.pas1.text.toString()
            val t2 = binding.pas2.text.toString()
            if (binding.pas1.text.isNotEmpty() && binding.pas2.text.isNotEmpty()) {
                if (t1.equals(t2)) {
                    startActivity(Intent(this, SecondActivity::class.java))

                } else {
                    Toast.makeText(this, "Passwords are not same", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Fill all the fields", Toast.LENGTH_SHORT).show()
            }
        }
    }


}


