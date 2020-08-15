package dungeon;

public class DivineSmite extends Attack {

	private static String attack = "brings down a Divine Light on top off";
	private static double chanceToHit = .5;
	private static int minDamage = 50;
	private static int maxDamage = 70;
	private HealBehavior healingSmite = new Heal();

	DivineSmite() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}

	@Override
	public void attack(DungeonCharacter opponent, DungeonCharacter attacker) {
		boolean canAttack;
		int damage;

		System.out.println(attacker.getName() + " " + attack + " " + opponent.getName());
		canAttack = Math.random() <= chanceToHit;

		if (canAttack) {
			damage = (int) (Math.random() * (maxDamage - minDamage + 1)) + minDamage;
			subtractHitPoints(opponent, damage);
			healingSmite.heal(attacker, damage / 2, damage / 2);

			System.out.println();
		} // end if can attack
		else {

			System.out.println(attacker.getName() + "'s attack on " + opponent.getName() + " failed!");
			System.out.println();
		} // end else
	}
}
