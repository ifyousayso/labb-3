public class Pikachu extends Monster {
	// Purpose: This is the class' constructor.
	// Arguments: -
	public Pikachu() {
		// name, maxHitPoints, attack, defense, experienceValue, goldValue
		super("Pikachu", 30, 12, 0, 20, 16);
	}

	// Purpose: Return the monster's reaction to damage.
	// Arguments: -
	// Return: String
	public String painReaction() {
		return "- It's me, MARIO!";
	}
}

