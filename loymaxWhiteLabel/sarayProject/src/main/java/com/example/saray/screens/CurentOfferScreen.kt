package com.example.saray.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composecomponents.dateBackgound.DateBackground
import com.example.composecomponents.googleMaps.GoogleMapComponent
import com.example.composecomponents.googleMaps.GoogleMapPlaceholder
import com.example.composecomponents.networkImages.LoadImage
import com.example.composecomponents.text.TextBackground
import com.example.saray.R
import com.example.saray.app.ext.Ext
import com.example.saray.navigation.navigationDrawer.NavigationDrawer
import com.example.saray.viewModel.OffersViewModel
import loymax.sdk.models.OfferModel
import uiState.UIState

//typealias mapClickHandler = () -> Unit

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CurrentOfferScreen(
    navController: NavHostController,
    offersViewModel: OffersViewModel,
    currentOfferId: Int?,
    onBack: () -> Boolean
) {
    val coroutineScope = rememberCoroutineScope()

    val stateCurrentOffer by remember {
        mutableStateOf(offersViewModel.stateCurrentOffer.value)
    }

    val uiState by remember {
        mutableStateOf(offersViewModel.uiState.value)
    }

    LaunchedEffect(key1 = offersViewModel) {
        if (currentOfferId != null) {
            offersViewModel.getCurrentOffer(currentOfferId)
        }
    }
    NavigationDrawer(navController) {
        when (uiState) {
            is UIState.Error -> {
                Text(text = "ERROR")
            }

            is UIState.Idle -> {
                Text(text = "IDLE")
            }

            is UIState.Loading -> {
                Text(text = "LOADING")
            }

            is UIState.Success -> {
                CurrentOfferView(stateCurrentOffer, offersViewModel)
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
private fun CurrentOfferView(stateCurrentOffer: OfferModel?, offersViewModel: OffersViewModel) {
    val dateTo: String? = stateCurrentOffer?.begin?.format(Ext().formatterDayMonth())
    val dateFrom: String? = stateCurrentOffer?.end?.format(Ext().formatterDayMonth())
    val imageUrl = stateCurrentOffer?.images?.firstOrNull()?.fileId?.let { fileId ->
        offersViewModel.getImageWithGuid(fileId.toString())
    }
    val padding = 10.dp
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.mainWhite))
    ) {
        Surface(
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomEnd = 0.dp,
                bottomStart = 0.dp
            ),
            color = Color.White,
            shadowElevation = 5.dp,
            modifier = Modifier
//                .padding(padding)
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
            Column {
                if (imageUrl != null) {
                    LoadImage(imageUrl = imageUrl)
                }
                Column(
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Text(
                        text = "${stateCurrentOffer?.title}",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        textAlign = TextAlign.Start,
                        fontStyle = FontStyle.Normal,
                    )
                    DateBackground(
                        dateTo = dateTo,
                        dateFrom = dateFrom,
                        rowModifier = Modifier
                            .padding(top = 10.dp, bottom = 10.dp)
                            .background(Color.LightGray, shape = RoundedCornerShape(15.dp)),
                    )
                    Text(
                        text = "${stateCurrentOffer?.description}"
                    )

                    Text(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        text = "Участвующие бренды",
                    )

                    stateCurrentOffer?.brands?.let { brandsList ->
                        LazyRow(
                            modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                            horizontalArrangement = Arrangement.spacedBy(5.dp),
                        ) {
                            items(brandsList.size) {
                                TextBackground(
                                    text = brandsList[it].name,
                                    image = Icons.Filled.LocationOn,
                                    rowModifier = Modifier.background(
                                        Color.Red,
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                )
                            }
                        }
                    }
                }
            }
        }

        Surface(
            shape = RoundedCornerShape(0.dp),
            color = Color.White,
            shadowElevation = 5.dp,
            modifier = Modifier
                .padding(top = 20.dp, bottom = 10.dp)
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
                modifier = Modifier.padding(horizontal = 10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Места проведения!",
                        modifier = Modifier,
                        fontStyle = FontStyle.Normal,
                    )

                    stateCurrentOffer?.merchantsCount?.let {
                        Text(
                            text =
                            if (it > 1) {
                                "${stateCurrentOffer.merchantsCount} Магзинов"
                            } else {
                                "${stateCurrentOffer.merchantsCount} Магазин"
                            },
                            modifier = Modifier,
                            fontStyle = FontStyle.Italic,
                        )
                    }
                }
                GoogleMapPlaceholder(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CurrentOfferPreview() {
    val dateTo: String? = "11"
    val dateFrom: String? = "12"
    val brands: MutableList<String> = mutableListOf("Бренд №1", "Бренд №2")
    val merchantsCount = 6
    val padding = 10.dp
    Column(
        modifier = Modifier
            .wrapContentSize()
            .background(colorResource(id = R.color.mainWhite))
    ) {
        Surface(
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomEnd = 0.dp,
                bottomStart = 0.dp
            ),
            color = Color.White,
            shadowElevation = 5.dp,
            modifier = Modifier
//                .padding(padding)
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
            Column {
//                LoadImage(
//                    imageUrl = null
//                )
                Column(
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Text(
                        text = "Каталог спец предложений сезона!",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        textAlign = TextAlign.Start,
                        fontStyle = FontStyle.Normal,
                    )
                    DateBackground(
                        dateTo = dateTo,
                        dateFrom = dateFrom,
                        rowModifier = Modifier
                            .padding(top = 10.dp, bottom = 10.dp)
                            .background(Color.LightGray, shape = RoundedCornerShape(15.dp)),
                    )
                    Text(
                        text = "Готовимся к новому сезону вместе с нашим обновленным катологом"
                    )
                    Text(
                        modifier = Modifier.padding(top = 10.dp),
                        text = "Участвующие бренды",
                    )
                    LazyRow(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                    ) {
                        items(brands.size) {
                            TextBackground(
                                text = brands[it],
                                image = Icons.Filled.LocationOn,
                                rowModifier = Modifier.background(
                                    Color.Red,
                                    shape = RoundedCornerShape(15.dp)
                                ),
                            )
                        }
                    }
                }
            }
        }

        Surface(
            shape = RoundedCornerShape(0.dp),
            color = Color.White,
            shadowElevation = 5.dp,
            modifier = Modifier
                .padding(top = 20.dp, bottom = 10.dp)
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
                modifier = Modifier.padding(horizontal = 10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Места проведения!",
                        modifier = Modifier,
                        fontStyle = FontStyle.Normal,
                    )
                    Text(
                        text = "$merchantsCount Магазинов",
                        modifier = Modifier,
                        fontStyle = FontStyle.Italic,
                    )
                }
                GoogleMapPlaceholder(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
            }
        }
    }
}
