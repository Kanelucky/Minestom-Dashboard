package org.kanelucky.gui

/**
 * @author Kanelucky
 */
data class DashboardConfig(
    val title: String = "Minestom Dashboard",
    val playerCountPrefix: String = "Online: ",
    val playerColumns: Array<String> = arrayOf("Name", "UUID")
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DashboardConfig) return false
        return title == other.title &&
                playerCountPrefix == other.playerCountPrefix &&
                playerColumns.contentEquals(other.playerColumns)
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + playerCountPrefix.hashCode()
        result = 31 * result + playerColumns.contentHashCode()
        return result
    }
}