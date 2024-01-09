package com.example.iampoor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.iampoor.ui.theme.IAmPoorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IAmPoorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray) {
                    Title()
                    RockImage()
                }
            }
        }
    }
}

@Composable
fun Title() {
    Text(
        text = "I Am Poor",
        Modifier.offset(x = 145.dp, y = 300.dp),
        style = MaterialTheme.typography.headlineMedium
    )
}

@Composable
fun RockImage() {
    val image = painterResource(id = R.drawable.coal)
    val desc = "Image of Rock"
    val imageModifier = Modifier
        .offset(x = 10.dp, y = 170.dp)
    Image(
        painter = image,
        contentDescription = desc,
        modifier = imageModifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IAmPoorTheme {
        Title()
        RockImage()
    }
}