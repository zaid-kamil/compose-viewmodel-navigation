package com.example.compose_view_model_demo_one.data

import com.example.compose_view_model_demo_one.model.Contact

class ContactUiState {
    // selected contact
    var selectedContact: Contact? = null
    val contacts = DataSource.contacts
}
