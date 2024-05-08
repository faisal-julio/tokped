package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListBottomCategory
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun BottomCategory(listBottomCategory: ListBottomCategory) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(end = 3.dp, bottom = 8.dp).width(90.dp)
        ){
        Image(
            painter = painterResource(id = listBottomCategory.imgBottomCategory),
            contentDescription = null,Modifier.size(40.dp))
        Text(stringResource(id = listBottomCategory.txtBottomCategory), fontSize = 14.sp, textAlign = TextAlign.Center)
    }
}

@Preview
@Composable
fun MainBottomCategory() {
    MarketTheme {
        BottomCategory(listBottomCategory = ListBottomCategory(R.drawable.play,R.string.txt_category_sport))
    }
}