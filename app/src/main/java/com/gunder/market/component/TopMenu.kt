package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.R
import com.gunder.market.model.ListTopMenu
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun TopMenu(listTopMenu: ListTopMenu) {
    Image(
        painter = painterResource(id = listTopMenu.imgTopMenu) ,
        contentDescription =null)
}

@Preview
@Composable
fun TopMenuPreview() {
    MarketTheme {
        TopMenu(
            listTopMenu = ListTopMenu(
                R.drawable.gopay, R.string.txt_gopay, R.string.txt_dummy_gopay
            )
        )
    }
}