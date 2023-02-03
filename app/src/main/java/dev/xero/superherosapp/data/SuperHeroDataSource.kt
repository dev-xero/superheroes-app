package dev.xero.superherosapp.data

import dev.xero.superherosapp.R
import dev.xero.superherosapp.model.SuperHero

/**
 * DataSource containing information on the superheroes.
 * Contains the [[heroes]] variable which is a [[List]] of [[SuperHero]]
 * */
class SuperHeroDataSource {
	val heroes = listOf<SuperHero>(
		SuperHero(
			imageResID = R.drawable.android_superhero1,
			nameResID = R.string.hero1,
			descriptionResID = R.string.description1
		),

		SuperHero(
			imageResID = R.drawable.android_superhero2,
			nameResID = R.string.hero2,
			descriptionResID = R.string.description2
		),

		SuperHero(
			imageResID = R.drawable.android_superhero3,
			nameResID = R.string.hero3,
			descriptionResID = R.string.description3
		),

		SuperHero(
			imageResID = R.drawable.android_superhero4,
			nameResID = R.string.hero4,
			descriptionResID = R.string.description4
		),

		SuperHero(
			imageResID = R.drawable.android_superhero5,
			nameResID = R.string.hero5,
			descriptionResID = R.string.description5
		),

		SuperHero(
			imageResID = R.drawable.android_superhero6,
			nameResID = R.string.hero6,
			descriptionResID = R.string.description6
		),
	)
}