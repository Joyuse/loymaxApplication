package com.example.composecomponents.networkImages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.composecomponents.R

@OptIn(ExperimentalCoilApi::class)
@Composable
fun LoadImage(
    imageUrl: String,
    customHeight: Dp = 200.dp,
    customModifier: Modifier =  Modifier
        .fillMaxWidth()
        .height(customHeight),
) {
    Image(
        painter = rememberImagePainter(
            data = imageUrl,
            builder = {
                crossfade(true)
            }
        ),
        contentDescription = null,
        modifier = customModifier,
        contentScale = ContentScale.Crop
    )

//    if (imageUrl != null) {
//        // Display the image from URL
//        Image(
//            painter = rememberImagePainter(
//                data = imageUrl,
//                builder = {
//                    crossfade(true)
//                }
//            ),
//            contentDescription = null,
//            modifier = customModifier,
//            contentScale = ContentScale.Crop
//        )
//    } else {
//        // Display the placeholder image
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = null,
//            modifier = customModifier,
//            contentScale = ContentScale.Crop
//        )
//    }
}

//TODO Добавить превью