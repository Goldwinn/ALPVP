package com.example.alpvp.model

data class Users (
    val user_id: Int = 0,
    val username: String = "",
    val email: String = "",
    val password: String = "",
    val profile_image: String = "",
    val library_recipe_id: Int = 0
)
