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
    primary = ForestGreen,
    onPrimary = OnForestGreen,
    primaryContainer = ForestGreenContainer,
    onPrimaryContainer = OnForestGreenContainer,
    secondary = Terracotta,
    onSecondary = OnTerracotta,
    secondaryContainer = TerracottaContainer,
    onSecondaryContainer = OnTerracottaContainer,
    tertiary = Ochre,
    onTertiary = OnOchre,
    tertiaryContainer = OchreContainer,
    onTertiaryContainer = OnOchreContainer,
    background = Cream,
    onBackground = OnCream,
    surface = Cream,
    onSurface = OnCream,
    surfaceVariant = CreamVariant,
    onSurfaceVariant = OnCreamVariant,
    outline = CreamOutline,
    surfaceContainerLowest = CreamContainerLowest,
    surfaceContainerLow = CreamContainerLow,
    surfaceContainer = CreamContainer,
    surfaceContainerHigh = CreamContainerHigh,
    surfaceContainerHighest = CreamContainerHighest
)

private val DarkColorScheme = darkColorScheme(
    primary = LightForestGreen,
    onPrimary = OnLightForestGreen,
    primaryContainer = LightForestGreenContainer,
    onPrimaryContainer = OnLightForestGreenContainer,
    secondary = LightTerracotta,
    onSecondary = OnLightTerracotta,
    secondaryContainer = LightTerracottaContainer,
    onSecondaryContainer = OnLightTerracottaContainer,
    tertiary = LightOchre,
    onTertiary = OnLightOchre,
    tertiaryContainer = LightOchreContainer,
    onTertiaryContainer = OnLightOchreContainer,
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

// Mørkegrøn top-bar i begge temaer: primary i lyst tema, primaryContainer i mørkt tema
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
