package kr.ac.kumoh.ce.s20160042.s23w12carddealer

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import kr.ac.kumoh.ce.s20160042.s23w12carddealer.ui.theme.S23W12CardDealerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S23W12CardDealerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        CardImages()
                        ShuffleButton()
                    }
                }
            }
        }
    }
}

@Composable
fun ColumnScope.CardImages() {
    if (LocalConfiguration.current.orientation
        == Configuration.ORIENTATION_LANDSCAPE) {
        Row(modifier = Modifier.weight(1f)) {
            Text("가로")
        }
    }
    else {
        Column(Modifier.weight(1f)) {
            Row(Modifier.weight(1f)) {
                Text("세로")
            }
            Row(Modifier.weight(1f)) {
                Text("세로")
            }
            Row(Modifier.weight(1f)) {
                Text("세로")
            }
        }
    }
}

@Composable
fun ShuffleButton() {
    Button(modifier = Modifier.fillMaxWidth(),
        onClick = {}) {
        Text("Good Luck")
    }
}