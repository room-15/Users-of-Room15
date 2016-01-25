object SargeBorsch: Room15User() {

    private val traits = setOf("sexy", "handsome", "clever", "funny", "circle")

    fun checkTrait(trait: String): String {
        return if (traits.contains(trait.toLowerCase())) {
            "Yes!"
        } else {
            "Maybe."
        }
    }

    fun getIQ(): Number {
        return Double.POSITIVE_INFINITY
    }
}