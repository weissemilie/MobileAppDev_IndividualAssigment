package dk.au.emilieweiss.individualassignment.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Sage,
    onPrimary = OnSage,
    primaryContainer = SageContainer,
    onPrimaryContainer = OnSageContainer,
    secondary = Taupe,
    onSecondary = OnTaupe,
    secondaryContainer = TaupeContainer,
    onSecondaryContainer = OnTaupeContainer,
    tertiary = Sand,
    onTertiary = OnSand,
    tertiaryContainer = SandContainer,
    onTertiaryContainer = OnSandContainer,
    error = Clay,
    onError = OnClay,
    errorContainer = ClayContainer,
    onErrorContainer = OnClayContainer,
    background = Beige,
    onBackground = OnBeige,
    surface = Beige,
    onSurface = OnBeige,
    surfaceVariant = BeigeVariant,
    onSurfaceVariant = OnBeigeVariant,
    outline = BeigeOutline,
    surfaceContainerLowest = BeigeContainerLowest,
    surfaceContainerLow = BeigeContainerLow,
    surfaceContainer = BeigeContainer,
    surfaceContainerHigh = BeigeContainerHigh,
    surfaceContainerHighest = BeigeContainerHighest
)

private val DarkColorScheme = darkColorScheme(
    primary = LightSage,
    onPrimary = OnLightSage,
    primaryContainer = LightSageContainer,
    onPrimaryContainer = OnLightSageContainer,
    secondary = LightTaupe,
    onSecondary = OnLightTaupe,
    secondaryContainer = LightTaupeContainer,
    onSecondaryContainer = OnLightTaupeContainer,
    tertiary = LightSand,
    onTertiary = OnLightSand,
    tertiaryContainer = LightSandContainer,
    onTertiaryContainer = OnLightSandContainer,
    error = LightClay,
    onError = OnLightClay,
    errorContainer = LightClayContainer,
    onErrorContainer = OnLightClayContainer,
    background = WarmDark,
    onBackground = OnWarmDark,
    surface = WarmDark,
    onSurface = OnWarmDark,
    surfaceVariant = WarmDarkVariant,
    onSurfaceVariant = OnWarmDarkVariant,
    outline = WarmDarkOutline,
    surfaceContainerLowest = WarmDarkContainerLowest,
    surfaceContainerLow = WarmDarkContainerLow,
    surfaceContainer = WarmDarkContainer,
    surfaceContainerHigh = WarmDarkContainerHigh,
    surfaceContainerHighest = WarmDarkContainerHighest
)

@Composable
fun IndividualAssignmentTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

// Salvie-grøn top-bar i begge temaer: primary i lyst tema, primaryContainer i mørkt tema
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun appTopAppBarColors(darkTheme: Boolean = isSystemInDarkTheme()): TopAppBarColors {
    val colors = MaterialTheme.colorScheme
    val container = if (darkTheme) colors.primaryContainer else colors.primary
    val content = if (darkTheme) colors.onPrimaryContainer else colors.onPrimary
    return TopAppBarDefaults.topAppBarColors(
        containerColor = container,
        titleContentColor = content,
        navigationIconContentColor = content,
        actionIconContentColor = content
    )
}
