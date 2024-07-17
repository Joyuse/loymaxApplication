package com.example.composecomponents.text

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composecomponents.R

@Composable
fun TextBackground(
    rowModifier: Modifier = Modifier
        .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
        .background(Color.LightGray, shape = RoundedCornerShape(15.dp)),
    imageModifier: Modifier = Modifier.padding(start = 10.dp),
    image: ImageVector = Icons.Filled.DateRange,
    textModifier: Modifier = Modifier
        .padding(start = 5.dp, end = 10.dp, top = 5.dp, bottom = 5.dp),
    textAlign: TextAlign = TextAlign.Left,
    text: String?,
) {
    Row(
        modifier = rowModifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if(text != null) {
            Image(
                modifier = imageModifier,
                imageVector = image,
                contentDescription = null
            )
            Text(
                modifier = textModifier,
                textAlign = textAlign,
                text = text ?: ""
            )
        }
    }
}

//TODO Добавить превью