package com.gunder.market.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.ui.theme.MarketTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.padding(10.dp)){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(IntrinsicSize.Min),
            horizontalArrangement = Arrangement.spacedBy(10.dp)

        ){
            OutlinedTextField(
                value = "",
                onValueChange = {},
                leadingIcon = { Icon(imageVector = Icons.Outlined.Search , contentDescription = null)},
                placeholder = { Text(text = "Search")},
                modifier = Modifier.widthIn(min = 220.dp)
            )
            Icon(imageVector = Icons.Outlined.Email, contentDescription = null )
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = null )
            Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = null )
            Icon(imageVector = Icons.Outlined.Menu, contentDescription = null )
        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
        ){
            Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = null,modifier.size(20.dp) )
            Text(text = "Di kirim ke alamat", fontSize = 12.sp)
            Text(text = "Faisal Yulianto", fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Icon(imageVector = Icons.Outlined.KeyboardArrowDown, contentDescription = null )
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
