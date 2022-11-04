package com.example.praktikumdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.praktikumdua.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.btA.setOnClickListener {
//            Snackbar.make(this, binding.btA, resources.getString(R.string.msg_nrp_nama), Snackbar.LENGTH_LONG).show()
//        }
//
////        if (binding.tvCount.text.toString().equals("0")){
////            binding.btB.isEnabled == false
////        } else {
////            binding.btB.isEnabled == true
////        }
//
//        binding.btB.setOnClickListener{
//            binding.tvCount.text = "0"
//        }
//
//        binding.btC.setOnClickListener {
//            binding.tvCount.text = (binding.tvCount.text.toString().toInt()+1).toString()
//        }

    }
}