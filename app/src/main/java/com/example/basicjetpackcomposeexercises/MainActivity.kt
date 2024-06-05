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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
//            Hello(name = "John")

            Column {
                Hello(name = "John")
                Hello(name = "Barbara")
            }

        }
    }//onCreate

}//MainActivity

@Composable
fun Hello(name:String){
    Text("Hello $name. Welcome to Jetpack Compose")
}

@Preview(showBackground = true)
@Composable
fun previewMainActivity(){
    Column {
        Column {
            Hello(name = "John")
            Hello(name = "Barbara")
        }
    }
}



//fun helloPreview(){
//    BasicJetpackComposeExercisesTheme {
//        //Hello(name = "John")
//
//    }
//}