data class Person (val pps: String, val name: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Person
        return pps == other.pps
    }

    override fun hashCode(): Int {
        return pps.hashCode()
    }
}