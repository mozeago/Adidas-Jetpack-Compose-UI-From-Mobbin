package com.tvtruelight.adidasjetpackcomposemobbin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tvtruelight.adidasjetpackcomposemobbin.ui.theme.AdidasJetpackComposeMobbinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdidasJetpackComposeMobbinTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = {
                        Text(text = "Bottom")
                    },
                    topBar = {
                        Text(text = "Top Bar")
                    }
                ) { innerPadding ->
                    Greeting(name = "Moses", modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdidasJetpackComposeMobbinTheme {
        Greeting("Android")
    }
}