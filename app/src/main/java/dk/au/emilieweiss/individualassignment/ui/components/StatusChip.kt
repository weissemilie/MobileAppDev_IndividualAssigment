package dk.au.emilieweiss.individualassignment.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dk.au.emilieweiss.individualassignment.R
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme

@Composable
fun StatusChip(isBorrowed: Boolean, modifier: Modifier = Modifier) {
    val colors = MaterialTheme.colorScheme
    val containerColor = if (isBorrowed) colors.errorContainer else colors.primaryContainer
    val contentColor = if (isBorrowed) colors.onErrorContainer else colors.onPrimaryContainer
    val label = stringResource(
        if (isBorrowed) R.string.status_borrowed else R.string.status_available
    )

    Surface(
        color = containerColor,
        contentColor = contentColor,
        shape = RoundedCornerShape(50),
        modifier = modifier
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StatusChipPreview() {
    IndividualAssignmentTheme {
        Row {
            StatusChip(isBorrowed = false)
            StatusChip(isBorrowed = true, modifier = Modifier.padding(start = 8.dp))
        }
    }
}
