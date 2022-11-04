package com.example.pertemuan5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pertemuan5.adapter.NameDataAdapter
import com.example.pertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names = ArrayList<String>()
        names.add("John Doe")
        names.add("Susan Bones")
        names.add("Richard Max")
        names.add("Abed Gantengs >//<")

        val nameDataAdapter = NameDataAdapter(names)
        nameDataAdapter.setNameDataListener(object : NameDataAdapter.NameDataListener{
            override fun nameDataClick(name: String) {
                Toast.makeText(this@MainActivity, "Hello $name", Toast.LENGTH_SHORT).show()
            }
        })
        val manager = LinearLayoutManager(this@MainActivity)
        binding.rvData.adapter = nameDataAdapter
        binding.rvData.layoutManager = manager
        binding.rvData.addItemDecoration(DividerItemDecoration(this@MainActivity, manager.orientation))

        binding.button.setOnClickListener {
val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}