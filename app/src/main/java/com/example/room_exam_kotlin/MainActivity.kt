package com.example.room_exam_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.room_exam_kotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
        R.layout.activity_main)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        //val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        /*
        viewModel.getAll().observe(this, Observer {
            result_text.text = it.toString()
        })
         */

        /*
        add_button.setOnClickListener {
            //Dispatchers.IO : Background Thread
            //코루틴 사용한 비동기
            lifecycleScope.launch(Dispatchers.IO) {
                viewModel.insert(todo_edit.text.toString())
            }
        }
         */
    }
}
