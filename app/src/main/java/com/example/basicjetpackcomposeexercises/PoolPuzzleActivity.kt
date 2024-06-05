package com.example.basicjetpackcomposeexercises

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicjetpackcomposeexercises.ui.theme.BasicJetpackComposeExercisesTheme

class PoolPuzzleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                TeamHello(namesList = listOf("John", "Ellie", "Barbara"))
            }
        }//setContent
    }
}


@Composable
fun TeamHello(namesList: List<String>){

        namesList.forEach {
            Text("Hello $it")
        }

}


@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    BasicJetpackComposeExercisesTheme {
        //Greeting2("Android")
        Column {
            TeamHello(namesList = listOf("John", "Ellie", "Barbara"))
        }
    }
}