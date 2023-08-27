package com.example.compose_view_model_demo_one.ui

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.compose_view_model_demo_one.model.Contact

@Composable
fun ContactDetail(
    contact: Contact,
    onContactShared: (Contact) -> Unit,
    modifier: Modifier = Modifier
) {

}

private fun shareContact(context: Context, contact: Contact) {
    val sendIntent: Intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TITLE, "Contact")
        putExtra(Intent.EXTRA_SUBJECT, "${contact.name} details")
        putExtra(Intent.EXTRA_TEXT, contact.toString())
        type = "text/plain"
    }
    context.startActivity(Intent.createChooser(
        sendIntent,
        "Share contact"
    ))
}