package com.shivesh.androidjetpacksamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ComposeSample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewGreeting()
        }
    }
}
@Composable
fun Greeting(name: String){
    Text(text = "Hi $name")
}
@Preview
@Composable
fun PreviewGreeting() {
    NewsStory()
}

@Composable
fun NewsStory(){
    Column {
        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }
}