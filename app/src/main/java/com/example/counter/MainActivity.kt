package com.example.counter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    var presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
               presenter.decrement()
            }
        }
    }

    override fun showCount(number: Number) {
        binding.countTv.text = number.toString()
    }

    override fun showTost() {
        Toast.makeText(this, "Congratulation", Toast.LENGTH_SHORT).show()
    }

    override fun changeCountColor(color: Int) {
        binding.countTv.setTextColor(color)
    }
}