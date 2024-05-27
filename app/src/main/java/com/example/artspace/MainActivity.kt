package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.ui.theme.ArtSpaceTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    ArtSpaceImageAndText(
        imagePainter = painterResource(R.drawable.monalisa),
        artName = stringResource(R.string.art_1_name),
        artist = stringResource(R.string.art_1_artist),
        artYear = stringResource(R.string.art_1_year)
    )
}


@Composable
fun ArtSpaceImageAndText(
    modifier: Modifier = Modifier,
    imagePainter: Painter,
    artName: String,
    artist: String,
    artYear: String,
    onClink: () -> Unit = {}) {

    var result by remember { mutableStateOf(1) }
    val imageResourc = when (result) {
        1 -> ArtSpaceImageAndText(
            imagePainter = painterResource(R.drawable.monalisa),
            artName = stringResource(R.string.art_1_name),
            artist = stringResource(R.string.art_1_artist),
            artYear = stringResource(R.string.art_1_year)
        )
        2 -> ArtSpaceImageAndText(
            imagePainter = ,
            artName = ,
            artist = ,
            artYear = )
        3 -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
        4 -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
        5 -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
        6 -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
        7 -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
        8 -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
        9 -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
        else -> ArtSpaceImageAndText(imagePainter = , artName = , artist = , artYear = )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ArtSpaceImageAndDescription(
            imagePainter = imagePainter
        )
        Spacer(modifier = Modifier.height(50.dp))
        Artist(
            modifier = Modifier.padding(bottom = 40.dp),
            artName = artName,
            artist = artist,
            artYear = artYear
        )
        Spacer(modifier = Modifier.height(50.dp))

        ArtSpaceButton(
                onClick = { result},
                modifier = Modifier
                    .padding(50.dp)
            )
    }
}

@Composable
fun ArtSpaceImageAndDescription(
    imagePainter: Painter,
//    artName: String,
//    artistName: String,
//    artYear: Int
      modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier
            .height(470.dp)
            .width(380.dp)
            .padding(5.dp),
        color = Color(0xD3D3D3),
        //border = BorderStroke(),
        tonalElevation = 5.dp,
        shadowElevation = 5.dp,
        //shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                contentScale = ContentScale
                    .FillBounds,
                modifier = Modifier
                    .height(390.dp)
                    .width(310.dp)
                    .fillMaxWidth()
            )
        }
    }
}
@Composable
fun Artist(
    artName: String,
    artist: String,
    artYear: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = artName,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.displayMedium
        )
        Text(
            text = artist,
            style = MaterialTheme.typography.displayLarge
        )
        Text(
            text = artYear,
            style = MaterialTheme.typography.labelSmall
        )
    }
}

@Composable
fun ArtSpaceButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(onClick = { onClick },
            modifier = Modifier
                .height(35.dp)
                .width(150.dp)) {
            Text(stringResource(R.string.previous_button))
        }
        Button(onClick = { onClick },
            modifier = Modifier
                .height(35.dp)
                .width(150.dp)) {
            Text(stringResource(R.string.next_button))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}