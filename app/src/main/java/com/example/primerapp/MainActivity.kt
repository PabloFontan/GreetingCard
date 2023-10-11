package com.example.primerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primerapp.ui.theme.PrimerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Liuva Fontán")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val fondocolor = Color( 0xFFFF9900)
    Surface(color = fondocolor) {

        Text(
            text = "Hello my name is $name!",
            modifier = modifier.padding(20.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimerAppTheme {
        Greeting("Liuva Fontán")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    PrimerAppTheme {
        Greeting("Liuva Fontán")
    }
}