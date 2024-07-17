package com.example.saray.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composecomponents.dateBackgound.DateBackground
import com.example.composecomponents.networkImages.LoadImage
import com.example.saray.R
import com.example.saray.app.ext.Ext
import com.example.saray.navigation.AppScreens
import com.example.saray.navigation.navigationDrawer.NavigationDrawer
import com.example.saray.viewModel.OffersViewModel
import loymax.sdk.models.OfferModel

typealias itemClickHandler = (Int) -> Unit

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun OffersScreen(navController: NavHostController, offersViewModel: OffersViewModel) {

    val coroutineScope = rememberCoroutineScope()

    val stateOffers by offersViewModel.stateOffers.collectAsState()

    val uiState by offersViewModel.uiState.collectAsState()

    LaunchedEffect(key1 = offersViewModel) {
        offersViewModel.getOffersList()
    }

    val itemClick: itemClickHandler = { intValue ->
        navController.navigate(AppScreens.CurrentOffer.withArgs(intValue))
    }

//    NavigationDrawer(navController) {
//        when(uiState) {
//            is UIState.Error -> {
//                Text(text = "ERROR")
//            }
//            is UIState.Idle -> {
//                Text(text = "IDLE")
//            }
//            is UIState.Loading -> {
//                Text(text = "LOADING")
//            }
//            is UIState.Success -> {
//                Text(text = "SUCCESS")
//                OfferCard(offerModels = stateOffers.value, itemClick, offersViewModel)
//            }
//        }
        OfferCard(offerModels = stateOffers, itemClick, offersViewModel)
//    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
private fun OfferCard(
    offerModels: MutableList<OfferModel>?,
    itemClick: itemClickHandler,
    offersViewModel: OffersViewModel
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.mainWhite)),
    ) {
        offerModels?.size?.let { count ->
            items(count) { index ->
                Spacer(modifier = Modifier.height(15.dp))
                OfferItem(offerModels, index, offersViewModel) {
                    it.id?.let { id -> itemClick.invoke(id) }
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun OfferItem(
    offerModels: MutableList<OfferModel>,
    index: Int,
    offersViewModel: OffersViewModel,
    onItemClick: (OfferModel) -> Unit,
) {
    val padding = 10.dp
    val density = LocalDensity.current
    val dateTo: String? = offerModels[index].begin?.format(Ext().formatterDayMonth())
    val dateFrom: String? = offerModels[index].end?.format(Ext().formatterDayMonth())
    val imageUrl = offerModels.getOrNull(index)?.images?.firstOrNull()?.fileId?.let { fileId ->
        offersViewModel.getImageWithGuid(fileId.toString())
    }
    Surface(
        shape = RoundedCornerShape(15.dp),
        color = Color.White,
        shadowElevation = 5.dp,
        modifier = Modifier
            .padding(padding)
            .drawWithContent {
                val paddingPx = with(density) { padding.toPx() }
                clipRect(
                    left = -paddingPx,
                    top = 0f,
                    right = size.width + paddingPx,
                    bottom = size.height + paddingPx
                ) {
                    this@drawWithContent.drawContent()
                }
            }
    ) {
        Column(
            modifier = Modifier
                .clickable {
                    onItemClick.invoke(offerModels[index])
                }
                .background(Color.White, shape = RoundedCornerShape(15.dp))
        ) {
            if (imageUrl != null) {
                LoadImage(imageUrl)
            }
            Column(
                modifier = Modifier
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp),
                    textAlign = TextAlign.Left,
                    text = offerModels[index].title ?: "",
                )
                DateBackground(dateTo = dateTo, dateFrom = dateFrom)
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
private fun OfferCardPreview() {

    val offerModels: MutableList<OfferModel>? = mutableListOf(
        OfferModel(
            title = "Водонагреватели для Вашего дома!",
            description = "Для Вас в магазинах Сарай спецпредложение!"
        ),
        OfferModel(
            title = "Теплый пол со скидкой!",
            description = "Сегодня для Вас **скидка 20%** на весь электрический теплый пол",
        )
    )
//    OfferCard(offerModels = offerModels, itemClick = {}, offersViewModel = offersViewModel)
}
