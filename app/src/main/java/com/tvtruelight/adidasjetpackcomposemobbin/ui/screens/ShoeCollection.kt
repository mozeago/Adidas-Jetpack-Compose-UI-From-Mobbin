package com.tvtruelight.adidasjetpackcomposemobbin.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.tvtruelight.adidasjetpackcomposemobbin.R
import java.util.Locale

@Composable
fun ShoeCollectionScreen(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(top = 50.dp, bottom = 80.dp)
            .background(Color(0XFFFDFDFD)),
        contentPadding = PaddingValues(horizontal = 5.dp, vertical = 5.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        verticalArrangement = Arrangement.spacedBy(3.dp)
    ) {
        items(20) { item ->
            Surface(
                tonalElevation = 10.dp,
                color = Color(0XFFEAECEB),
                shadowElevation = 10.dp,
            ) {
                Column(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.favorite),
                        contentDescription = null,
                        modifier = Modifier.align(alignment = Alignment.End)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.adidas_shoe_1),
                        contentDescription = "shoe image",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(15.dp))
                    Image(
                        painter = painterResource(id = R.drawable.adidas_ar),
                        contentDescription = null
                    )
                    Text(
                        text = stringResource(R.string.best_seller).uppercase(),
                        fontStyle = FontStyle.Italic,
                        modifier = Modifier
                            .background(Color.White)
                            .padding(5.dp),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "$ 45.00",
                        modifier = Modifier
                            .background(Color.White)
                            .padding(5.dp),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = stringResource(R.string.gazelle_bold_shoes).replaceFirstChar {
                            if (it.isLowerCase()) it.titlecase(
                                Locale.ROOT
                            ) else it.toString()
                        },
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth(),
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "women's Originals"
                        )
                        Text(
                            modifier = Modifier
                                .padding(start = 5.dp),
                            text = "+3", textAlign = TextAlign.End,
                        )
                    }
                }
            }
        }
    }
}