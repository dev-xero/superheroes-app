package dev.xero.superherosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.xero.superherosapp.data.SuperHeroDataSource
import dev.xero.superherosapp.model.SuperHero
import dev.xero.superherosapp.ui.theme.SuperherosAppTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			SuperherosAppTheme {
				SuperHeroApp()
			}
		}
	}
}

@Composable
fun SuperHeroApp(
	modifier: Modifier = Modifier
) {
	Scaffold() {
		padding ->
		LazyColumn(
			modifier = Modifier
				.padding(padding)
				.fillMaxSize(),
			verticalArrangement = Arrangement.spacedBy(8.dp)
		) {
			items(SuperHeroDataSource().heroes) { hero ->
				HeroCardItem(hero = hero)
			}
		}
	}
}


@Composable
fun HeroCardItem(
	modifier: Modifier = Modifier,
	hero: SuperHero
) {
	Card(
		modifier = modifier.fillMaxWidth().padding(8.dp)
	) {
		Row(
			modifier = Modifier
				.padding(8.dp),
				horizontalArrangement = Arrangement.spacedBy(8.dp),
				verticalAlignment = Alignment.CenterVertically
		) {
			Column(
				modifier = Modifier
					.weight(1f)
			) {
				Text(
					text = stringResource(id = hero.nameResID)
				)

				Text(
					text = stringResource(id = hero.descriptionResID)
				)
			}

			Image(
				painter = painterResource(id = hero.imageResID),
				contentDescription = null,
				contentScale = ContentScale.Crop,
				modifier = Modifier
					.size(64.dp)
					.clip(shape = RoundedCornerShape(15))
			)
		}
	}
}

@Preview
@Composable
fun HeroCardsPreview() {
	SuperherosAppTheme(darkTheme = false) {
		SuperHeroApp()
	}
}