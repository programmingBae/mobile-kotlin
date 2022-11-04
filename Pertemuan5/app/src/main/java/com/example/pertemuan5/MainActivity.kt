package com.example.pertemuan5

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.pertemuan5.databinding.ActivityMainBinding
import com.example.pertemuan5.entity.Faculty
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // RadioButton
        binding.radioButton7.setOnCheckedChangeListener { compoundButton, b ->
            Toast.makeText(this@MainActivity, resources.getString(R.string.text_male) + " is " +
                    if (b) "selected" else "unselected", Toast.LENGTH_SHORT).show()
        }

        // Checkbox
        binding.chReading.setOnCheckedChangeListener { compoundButton, b ->
            Toast.makeText(this@MainActivity, resources.getString(R.string.text_reading) + " is " +
                    if (b) "selected" else "unselected", Toast.LENGTH_SHORT).show()
        }

        // Spinner
        binding.spinFaculties.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@MainActivity, p0?.getItemAtPosition(p2).toString(),
                Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

    }

        // Data from API
        val faculties = ArrayList<Faculty>()
        faculties.add(Faculty("1","Medicine"))
        faculties.add(Faculty("2","Engineering"))
        faculties.add(Faculty("3","Information Technology"))
        val facultyAdapter = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_spinner_dropdown_item,
            faculties
        )
        binding.spinFaculties.adapter = facultyAdapter

        // DatePicker
        val calendar = Calendar.getInstance()
        binding.buttonSelectDate.setOnClickListener {
            DatePickerDialog(
                this@MainActivity,
                {datePicker, i, i2, i3 ->
                    calendar.set(Calendar.YEAR, i)
                    calendar.set(Calendar.MONTH, i2)
                    calendar.set(Calendar.DATE, i3)
                    Toast.makeText(this@MainActivity, calendar.time.toString(), Toast.LENGTH_SHORT).show()
                } ,
                calendar[Calendar.YEAR],
                calendar[Calendar.MONTH],
                calendar[Calendar.DATE]
            ).show()
        }

        binding.buttonOpenSecond.setOnClickListener {
            val secondIntent = Intent(this@MainActivity, SecondActivity::class.java).apply{
                putExtra("PAKET", binding.spinFaculties.selectedItem as Faculty)
            }
            startActivity(secondIntent)
        }

}
}