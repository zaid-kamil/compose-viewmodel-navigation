package com.example.compose_view_model_demo_one.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.compose_view_model_demo_one.data.ContactUiState
import com.example.compose_view_model_demo_one.model.Contact


@Composable
fun ContactList(
    uiState: ContactUiState,
    onContactSelected: (Contact) -> Unit,
    onAddContact: () -> Unit,
    modifier: Modifier = Modifier
) {
}