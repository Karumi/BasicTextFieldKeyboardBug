package com.karumi.basictextfieldkeyboardbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.karumi.basictextfieldkeyboardbug.ui.theme.BasicTextFieldKeyboardBugTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text: String by remember { mutableStateOf("") }
            BasicTextFieldKeyboardBugTheme {
                Surface(color = MaterialTheme.colors.background) {
                    BasicTextField(
                        modifier = Modifier.fillMaxSize().padding(20.dp),
                        value = text,
                        onValueChange = { text = it }
                    )
                }
            }
        }
    }
}