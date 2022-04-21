package com.igormeira.compose_examples

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igormeira.compose_examples.collapsetoolbar.CollapseToolBarActivity
import com.igormeira.compose_examples.lazycolumn.LazyColumnActivity
import com.igormeira.compose_examples.ui.theme.ComposeExamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DisplayNavigationButtons(LocalContext.current)
                }
            }
        }
    }
}

@Composable
fun DisplayNavigationButtons(context: Context) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(5.dp)
    ) {
        Button(onClick = {
            context.startActivity(Intent(context, CollapseToolBarActivity::class.java))
        }) {
            Text(text = "Collapse Action Bar")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            context.startActivity(Intent(context, LazyColumnActivity::class.java))
        }) {
            Text(text = "Lazy Column")
        }
    }
}

@Preview(showSystemUi = true)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeExamplesTheme {
        DisplayNavigationButtons(LocalContext.current)
    }
}