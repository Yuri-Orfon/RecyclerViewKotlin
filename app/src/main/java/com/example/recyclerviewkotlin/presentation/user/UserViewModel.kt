package com.example.recyclerviewkotlin.presentation.user

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewkotlin.model.User

class UserViewModel: ViewModel() {
    val usersLiveData: MutableLiveData<List<User>> = MutableLiveData()

    fun getUsers(){
        usersLiveData.value = createUsers()
    }

    fun createUsers(): List<User>{
        return listOf(
            User("Yuri Orfon","Android Developer"),
            User("Yuri Orfon","Android Developer"),
            User("Yuri Orfon","Android Developer")
        )
    }
}