package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListCategory
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun Topcategory(listCategory: ListCategory) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(start = 5.dp,end = 20.dp, top = 8.dp).width(IntrinsicSize.Max)
    ){
        Image(
            painter = painterResource(id = listCategory.imgTopCategory),
            contentDescription = null ,Modifier.size(40.dp))
        Text(stringResource(id = listCategory.txtTopCategory), fontSize = 14.sp, textAlign = TextAlign.Center)

    }
}

@Preview
@Composable
fun TopCategoryPreview() {
    MarketTheme {
        Topcategory(listCategory = ListCategory(R.drawable.cicil,R.string.txt_credit))
    }
}