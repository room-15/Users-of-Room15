class Adam : Room15User {
	private val speed = 1.0F // He's getting faster. http://chat.stackoverflow.com/transcript/message/30989844#30989844
	private val ping = Float.MAX_VALUE // Expressed in MS
	private val isDumbass = true
	private val hasAbandonedUs = true
	private val dadJokes: List<DadJoke>
	private val tristanRandomLinksBuffer: List<String>

	//TODO: Create method to find keystore
	private val ks: KeyStore?

	init {
		ks = null
		dadJokes = ArrayList(Integer.MAX_VALUE)
		tristanRandomLinksBuffer = ArrayList(Integer.MAX_VALUE)
	}

	val hasLostKeystore: Boolean = true
	val hasCircle = true
	val isRoomOwner = true
	var keystoreLostCount = 1

	// Add lovers in order from most to least.
	val lovers: List<String> = listOf("Tristan", "Mauker")

	override fun clone() = codeMagic()
}