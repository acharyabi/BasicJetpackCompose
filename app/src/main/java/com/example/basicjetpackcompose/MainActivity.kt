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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
                //Surface(
                var count by remember {
                 //Value isn't initialized in every function calling.
                    mutableStateOf(0)
                    }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                   Text(
                       text = count.toString() ,
                       fontSize = 30.sp
                       )
                    Button(onClick ={
                        count += 1
                    }){
                        Text(text = "Click Me!")
                    }
                }
            }
        }
    }
}
/*
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

//Using Box layout.
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
    //Adding images in the form of a list

/*    Column {

       for(i in 1..10) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )
        }
    }

*/

/*
    //Adding Images to the App.
    Image(painter= painterResource(id = R.drawable.ic_launcher_foreground) ,
        contentDescription =null,
        modifier=Modifier.background(Color.Black))
        
*/

//Layout Initial Inspector
    //Act as  a recycler view and made accordingly with time.
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(10){ i->
            Icon(imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicJetpackComposeTheme {
        //Passing Android For The Name.
        Greeting("Android")
    }
}

 */