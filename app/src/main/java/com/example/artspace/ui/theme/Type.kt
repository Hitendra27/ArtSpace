package com.example.artspace.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.artspace.R

// Set of Material typography styles to start with
val SyneRegular = FontFamily(
    Font(R.font.syne_regular),
)


val SyneMeduim = FontFamily(
    Font(R.font.syne_medium, FontWeight.Bold)
)

val StyleScript = FontFamily(
    Font(R.font.stylescript_regular)
)


val Typography = Typography(
    displayMedium = TextStyle(
        fontFamily = SyneRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayLarge = TextStyle(
        fontFamily = StyleScript,
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp
    ),
    labelSmall = TextStyle(
        fontFamily = SyneMeduim,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = StyleScript,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)