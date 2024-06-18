package com.example.verdeevida.species.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.verdeevida.core.presentation.rememberBitmapFromBytes
import com.example.verdeevida.species.domain.Specie

@Composable
fun SpeciePhoto(
    specie: Specie?,
    modifier: Modifier = Modifier,
    iconSize: Dp = 25.dp
) {
    val bitmap = rememberBitmapFromBytes(specie?.photoBytes)
    val photoModifier = modifier.clip(RoundedCornerShape(35))

    if(bitmap != null) {
        Image(
            bitmap = bitmap,
            contentDescription = specie?.name,
            modifier = photoModifier,
            contentScale = ContentScale.Crop
        )
    } else {
        Box(
            modifier = photoModifier
            .background(MaterialTheme.colorScheme.secondaryContainer),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Rounded.Add,
                contentDescription = specie?.name,
                modifier = Modifier.size(iconSize),
                tint = MaterialTheme.colorScheme.onSecondaryContainer
            )
        }
    }
}