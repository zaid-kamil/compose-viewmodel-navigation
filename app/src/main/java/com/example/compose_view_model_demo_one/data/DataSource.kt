package com.example.compose_view_model_demo_one.data

import com.example.compose_view_model_demo_one.model.Contact

object DataSource {
    val contacts = listOf(
        Contact(name = "John", phone = "1234567890", email = "john@gmail.com"),
        Contact(name = "Peter", phone = "1234567890", email = "peter@live.com"),
        Contact(name = "Mary", phone = "1234567890", email = "mary@outlook.com"),
    )
}