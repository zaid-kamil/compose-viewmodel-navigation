package com.example.compose_view_model_demo_one.model

import androidx.annotation.DrawableRes
import com.example.compose_view_model_demo_one.R

// a contact model

enum class Group {
    FAMILY, FRIENDS, WORK
}

data class Contact(
    val name: String,
    val phone: String,
    val email: String,
    val group: Group = Group.FRIENDS,
    @DrawableRes val image: Int = R.drawable.ic_user_default
)
