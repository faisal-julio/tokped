package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.R
import com.gunder.market.model.ListCardForYou
import com.gunder.market.ui.theme.MarketTheme
import androidx.compose.ui.unit.dp

@Composable
fun BannerVertikal(listCardForYou: ListCardForYou) {
    Card (modifier = Modifier.padding(4.dp)) {
        Image(painterResource(
            id = listCardForYou.imgCard),
            contentDescription = stringResource(id = listCardForYou.txtDesc) )
    }
}

@Preview(showBackground = true)
@Composable
fun BannerVertikalPrev() {
    MarketTheme {
        BannerVertikal(
            listCardForYou = ListCardForYou(
                R.drawable.banner_vertikal1,
                R.string.txt_desc_first_banner
            )
        )
    }
}