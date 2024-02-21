package com.curso.proyectocompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import kotlinx.coroutines.CoroutineScope


@Composable
fun ContactsScreen() {
    val contacts = ContactsRepository.getContacts()
    val coroutineScope = rememberCoroutineScope()

    Surface(color = MaterialTheme.colors.background) {
        LazyColumn {
            items(contacts) { contact ->
                ContactItem(contact = contact, coroutineScope = coroutineScope)
            }
        }
    }
}

@Composable
fun ContactItem(contact: Contact, coroutineScope: CoroutineScope) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Carga la imagen del contacto desde la URL
            val painter = rememberImagePainter(
                data = contact.imageUrl,
                builder = {
                    // Configura opciones de manejo de errores aquí
                    error(R.drawable.placeholder) // Placeholder para mostrar en caso de error
                }
            )

            Image(
                painter = painter,
                contentDescription = "Contact Image",
                modifier = Modifier
                    .size(64.dp)
                    .padding(end = 16.dp)
            )

            Column {
                Text(
                    text = contact.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = contact.phoneNumber,
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            }
        }
    }
}
