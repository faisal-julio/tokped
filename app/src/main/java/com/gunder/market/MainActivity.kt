package com.gunder.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.component.BottomCategory
import com.gunder.market.component.CardCategory
import com.gunder.market.component.ImageBanner
import com.gunder.market.component.TopBar
import com.gunder.market.component.TopMenu
import com.gunder.market.component.Topcategory
import com.gunder.market.model.dummyListBanner
import com.gunder.market.model.dummyListBottomCategory
import com.gunder.market.model.dummyListImageBanner
import com.gunder.market.model.dummyListTopCategory
import com.gunder.market.model.dummyListTopMenus
import com.gunder.market.ui.theme.MarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MarketApp()
                }
            }
        }
    }
}

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
//        Top your code compose here
        TopBar()
        MainTopMenu()
        MainTopCategory()
        MainCardCategory()
        MainBottomCategory()
        MainImageBanner()
    }
}

@Composable
fun MainTopMenu() {
    LazyRow(modifier = Modifier.padding(start = 10.dp)){
       items(dummyListTopMenus){
            TopMenu(listTopMenu = it)
       }
    }
}

@Composable
fun MainTopCategory() {
    LazyRow(Modifier.padding(start = 10.dp, top = 10.dp)){
        items(dummyListTopCategory){
            Topcategory(listCategory = it)
        }
    }
}

@Composable
fun MainBottomCategory() {
    LazyRow{
        items(dummyListBottomCategory){
            BottomCategory(listBottomCategory = it)
        }
    }
}

@Composable
fun MainCardCategory() {
    LazyRow(modifier = Modifier.padding(10.dp)){
        items(dummyListBanner){
            CardCategory(listBanner = it)
        }
    }
}

@Preview
@Composable
fun MainCardCategoryPrev() {
    MarketTheme {
        MainCardCategory()
    }
}

@Preview(showBackground = true)
@Composable
fun MainBottomCategoryPreview() {
    MarketTheme {
        MainBottomCategory()
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopcategoryPreview() {
    MarketTheme {
        MainTopCategory()
    }
}

@Composable
fun MainImageBanner() {
    LazyVerticalGrid(GridCells.Fixed(2)){
        items(dummyListImageBanner){
            ImageBanner(listImageBanner = it)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainImageBannerPrev() {
    MarketTheme {
        MainImageBanner()
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopMenuPreview() {
    MarketTheme {
        MainTopMenu()
    }
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketTheme {
        MarketApp()
    }
}