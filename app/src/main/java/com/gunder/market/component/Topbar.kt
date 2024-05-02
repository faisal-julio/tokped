package com.gunder.market.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.ui.theme.MarketTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Column {
        Row {
            OutlinedTextField(
                value = "",
                onValueChange ={},
                leadingIcon = { Icon(imageVector = Icons.Outlined.Search , contentDescription = null)},
                placeholder = { (Text(text = "Search"))}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    MarketTheme {
        TopBar()
    }

}
