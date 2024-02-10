package com.tvtruelight.adidasjetpackcomposemobbin.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.tvtruelight.adidasjetpackcomposemobbin.R
import java.util.Locale

@Composable
fun BottomAppNavigation(modifier: Modifier = Modifier) {
    NavigationBar(
        containerColor = Color(0XFFFDFDFD),
        modifier = modifier
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {

            },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            },
            label = {
                Text(
                    text = stringResource(id = R.string.navigation_home).replaceFirstChar {
                        if (it.isLowerCase()) it.titlecase(
                            Locale.ROOT
                        ) else it.toString()
                    },
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        NavigationBarItem(
            selected = true,
            onClick = {

            },
            icon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            label = {
                Text(text = stringResource(id = R.string.navigation_search).replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(
                        Locale.ROOT
                    ) else it.toString()
                })
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {

            },
            icon = {
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)
            },
            label = {
                Text(text = stringResource(id = R.string.navigation_favorites).replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(
                        Locale.ROOT
                    ) else it.toString()
                })
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {

            },
            icon = {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
            },
            label = {
                Text(text = stringResource(id = R.string.navigation_shop).replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(
                        Locale.ROOT
                    ) else it.toString()
                })
            }
        )

    }

}