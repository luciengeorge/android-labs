package com.luciengeorge.birthday_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luciengeorge.birthday_card.ui.theme.BirthdaycardTheme

class ComposeArticle : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compose_article)
        setContent {
            BirthdaycardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun Article() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            style = TextStyle(textAlign = TextAlign.Justify),
            modifier = Modifier
                .padding(8.dp)
        )
        Text(
            text = stringResource(R.string.short_description),
            style = TextStyle(textAlign = TextAlign.Justify),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        )
        Text(
            text = stringResource(id = R.string.long_description),
            style = TextStyle(textAlign = TextAlign.Justify),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    BirthdaycardTheme {
        Article()
    }
}