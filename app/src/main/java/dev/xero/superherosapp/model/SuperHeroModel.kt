package dev.xero.superherosapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * [SuperHero] Specification data class
 * @param imageResID [[DrawableRes]] Drawable Res ID for this hero's icon
 * @param nameResID [[StringRes]] String Res ID for this hero's name
 * @param descriptionResID [[StringRes]] String Res ID for this hero's description
 * */
data class SuperHero (
	@DrawableRes val imageResID: Int,
	@StringRes val nameResID: Int,
	@StringRes val descriptionResID: Int
)