package com.example.pertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuan5.databinding.ActivitySecondBinding
import com.example.pertemuan5.entity.Faculty

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val faculty : Faculty? = intent.getParcelableExtra("PAKET")
        Toast.makeText(this@SecondActivity, faculty?.toString(), Toast.LENGTH_SHORT).show()
    }
}