package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.R
import com.gunder.market.model.ListImageBanner
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun ImageBanner(listImageBanner: ListImageBanner) {
        Row {
            Image(
                painter = painterResource(id = listImageBanner.imgBannerHor),
                contentDescription = null)
        }
}

@Preview(showBackground = true)
@Composable
fun ImageBannerPrev() {
    MarketTheme {
        ImageBanner(listImageBanner = ListImageBanner(R.drawable.banner_horizontal_1))
    }
}