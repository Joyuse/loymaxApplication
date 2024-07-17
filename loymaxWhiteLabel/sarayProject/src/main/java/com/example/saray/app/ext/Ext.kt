package com.example.saray.app.ext

import android.graphics.BlurMaskFilter
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
import java.util.Locale

class Ext {
    @RequiresApi(Build.VERSION_CODES.O)
    fun formatterDayMonth(locale: Locale = Locale("ru")): DateTimeFormatter {
        return DateTimeFormatter.ofPattern("d MMMM", locale)
    }
}