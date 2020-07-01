package com.example.recyclerviewkotlin.presentation.user

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViewModel()

    }

    private fun initializeViewModel() {
        val viewModel: UserViewModel = of(this).get(UserViewModel::class.java)
        viewModel.usersLiveData.observe(this, androidx.lifecycle.Observer {
            it?.let { user ->
                with(recyclerview){
                    layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = Adapter(user)
                }
            }
        })
        viewModel.getUsers()
    }
}