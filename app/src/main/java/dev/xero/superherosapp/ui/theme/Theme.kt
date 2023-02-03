package dev.xero.superherosapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
	primary = md_theme_dark_primary,
	onPrimary = md_theme_dark_onPrimary,
	surface = md_theme_dark_surface,
	onSurface = md_theme_dark_onSurface,
	secondary = md_theme_dark_secondary,
	background = md_theme_dark_background
)

private val LightColorPalette = lightColors(
	primary = md_theme_light_primary,
	onPrimary = md_theme_light_onPrimary,
	surface = md_theme_light_surface,
	onSurface = md_theme_light_onSurface,
	secondary = md_theme_light_secondary,
	background = md_theme_light_background
)

@Composable
fun SuperherosAppTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit
) {
	val colors = if (darkTheme) {
		DarkColorPalette
	} else {
		LightColorPalette
	}

	MaterialTheme(
		colors = colors,
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}