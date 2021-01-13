package com.cbellmont.ejercicioadapterstarwars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbellmont.ejercicioadapterstarwars.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter : FilmsAdapter = FilmsAdapter()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createRecyclerView()
    }

    private fun createRecyclerView() {
        binding.filmRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.filmRecyclerView.adapter = adapter
    }
}