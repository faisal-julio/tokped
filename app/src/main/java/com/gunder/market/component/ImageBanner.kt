package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListImageBanner
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun ImageBanner(listImageBanner: List<ListImageBanner>) {
    listImageBanner.forEach  { imgBanner ->
        Row {
            Card (modifier = Modifier.padding(4.dp)){
                Image(
                    painter = painterResource(id = imgBanner.imgBannerHor),
                    contentDescription = null,

                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageBannerPrev() {
    MarketTheme {
        ImageBanner(
            listImageBanner = listOf(ListImageBanner(R.drawable.banner_horizontal_1),
                                    ListImageBanner(R.drawable.banner_horizontal_2)
            )
        )
    }
}