package dev.xero.superherosapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.xero.superherosapp.R

val Inter = FontFamily(
	Font(R.font.inter_regular, FontWeight.Normal),
	Font(R.font.inter_bold, FontWeight.Bold)
)

val Cabin = FontFamily(
	Font(R.font.cabin_bold, FontWeight.Bold),
	Font(R.font.cabin_regular, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
	h1 = TextStyle(
		fontFamily = Cabin,
		fontWeight = FontWeight.Bold,
		fontSize = 30.sp
	),

	h2 = TextStyle(
		fontFamily = Cabin,
		fontWeight = FontWeight.Bold,
		fontSize = 20.sp
	),

	h3 = TextStyle(
		fontFamily = Inter,
		fontWeight = FontWeight.Bold,
		fontSize = 18.sp
	),

	body1 = TextStyle(
		fontFamily = Cabin,
		fontWeight = FontWeight.Normal,
		fontSize = 16.sp
	),

	caption = TextStyle(
		fontFamily = Cabin,
		fontWeight = FontWeight.Normal,
		fontSize = 14.sp
	)

)