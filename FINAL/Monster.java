<<<<<<< HEAD

public class Monster extends DungeonCharacter {
	private double chanceToHeal;
	private int minHeal, maxHeal;
  
  public Monster(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, double chanceToHeal,
					 int damageMin, int damageMax,
					 int minHeal, int maxHeal, AttackBehavior attack)
  {
	super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToHeal, maxHeal, attack);
	setMinHeal(minHeal);

  }
  private void setMinHeal(int minHeal) {
	this.minHeal=minHeal;
	
 }
public void heal()
  {
	boolean canHeal;
	int healPoints;

	canHeal = (Math.random() <= chanceToHeal) && (getHitPoints() > 0);

	if (canHeal)
	{
		healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
		addHitPoints(healPoints);
		System.out.println(getName() + " healed itself for " + healPoints + " points.\n"
							+ "Total hit points remaining are: " + getHitPoints());
		System.out.println();
	}


  }


 public void subtractHitPoints(int hitPoints)
 {
		super.subtractHitPoints(hitPoints);
		heal();

 }

}
=======

public class Monster extends DungeonCharacter {
	private double chanceToHeal;
	private int minHeal, maxHeal;
  
  public Monster(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, double chanceToHeal,
					 int damageMin, int damageMax,
					 int minHeal, int maxHeal, AttackBehavior attack)
  {
	super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToHeal, maxHeal, attack);
	setMinHeal(minHeal);

  }
  private void setMinHeal(int minHeal) {
	this.minHeal=minHeal;
	
 }
public void heal()
  {
	boolean canHeal;
	int healPoints;

	canHeal = (Math.random() <= chanceToHeal) && (getHitPoints() > 0);

	if (canHeal)
	{
		healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
		addHitPoints(healPoints);
		System.out.println(getName() + " healed itself for " + healPoints + " points.\n"
							+ "Total hit points remaining are: " + getHitPoints());
		System.out.println();
	}


  }


 public void subtractHitPoints(int hitPoints)
 {
		super.subtractHitPoints(hitPoints);
		heal();

 }

}
>>>>>>> b10c09556709c7e5eb86065fd895458b5cd7fa91
