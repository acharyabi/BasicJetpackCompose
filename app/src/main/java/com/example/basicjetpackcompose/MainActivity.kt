package com.example.basicjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basicjetpackcompose.ui.theme.BasicJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
/*
    /*Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            //.fillMaxHeight()
            //.fillMaxWidth()
            .size(400.dp)
            //.fillMaxSize()
            //.background(Color.White)

    )*/
    Box(
        modifier = Modifier
            .size(400.dp) ,
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Hello $name!",
            color = Color.Blue,
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
            //The modifier code is ran sequentially.
//            modifier = Modifier
//                .background(Color.Red)
//                .padding(16.dp)
//                .background(Color.Green)
        )
        Text(
            text = "Some other text!!",
            color = Color.Blue,
            fontSize = 30.sp,
            //The modifier code is ran sequentially.
//            modifier = Modifier
//                .background(Color.Red)
//                .padding(16.dp)
//                .background(Color.Green)
        )
    }

 */
    Column {

       for(i in 1..10) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )
        }
    }
    /*
    //Adding Images to the App.
    Image(painter= painterResource(id = R.drawable.ic_launcher_foreground) ,
        contentDescription =null,
        modifier=Modifier.background(Color.Black))
        
     */
}
//Layout Initial Inspector
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicJetpackComposeTheme {
        //Passing Android For The Name.
        Greeting("Android")
    }
}