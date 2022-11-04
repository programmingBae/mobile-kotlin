package com.example.pertemuan5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pertemuan5.R
import com.example.pertemuan5.databinding.StudentItemBinding
import com.example.pertemuan5.entities.Student

class StudentDataAdapter(private val students: ArrayList<Student>) : RecyclerView.Adapter<StudentDataAdapter.StudentViewHolder>() {
    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding: StudentItemBinding
        init {
         binding = StudentItemBinding.bind(itemView)
        }

        fun setData(student: Student){
            binding.tvName.text = student.firstName + " " + student.lastName
            binding.tvDepartment.text = student.department
            binding.tvStudentId.text = student.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.setData(students[position])
    }

    override fun getItemCount(): Int {
        return students.size
    }

//
//    interface StudentDataListener {
//        fun studentDataClick(student: Student){
//
//        }
//    }


}