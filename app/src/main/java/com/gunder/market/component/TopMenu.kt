package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListTopMenu
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun TopMenu(listTopMenu: ListTopMenu,modifier: Modifier = Modifier) {
    Row (
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.height(40.dp)
    ){
        Image(
            painter = painterResource(id = listTopMenu.imgTopMenu) ,
            contentDescription =null,modifier.size(40.dp))


        Column {
            Text(stringResource(id = listTopMenu.txtTopMenu), fontSize = 14.sp)
            Text(stringResource(id = listTopMenu.descTopMenu), fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }
        Divider(modifier = Modifier.width(1.dp).height(40.dp))
    }
}

@Preview
@Composable
fun TopMenuPreview() {
    MarketTheme {
        TopMenu(
            listTopMenu = ListTopMenu(
                R.drawable.plus, R.string.txt_dummy_discount, R.string.txt_subscription
            )
        )
    }
}