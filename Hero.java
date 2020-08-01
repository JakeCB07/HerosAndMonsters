import java.util.Scanner;

public abstract class Hero extends DungeonCharacter
{
	protected static Scanner playerInput = new Scanner(System.in);
	protected double chanceToBlock;
	protected int numTurns;

  public Hero(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior,
					 double chanceToBlock)
  {
	super(name, hitPoints, attackSpeed, attackBehavior);
	this.chanceToBlock = chanceToBlock;
	readName();
  }

  public void readName()
  {
		System.out.print("Enter character name: ");
		name = playerInput.nextLine();
  }//end readName method

  public boolean defend()
  {
		return Math.random() <= chanceToBlock;

  }//end defend method

  public void gotHit(DungeonCharacter opponent)
  {
		if (defend())
		{
			System.out.println(name + " BLOCKED the attack!");
		}
		else
		{
			opponent.attackBehavior.attack(opponent, this);
		}


  }//end method

	public void battleChoices(DungeonCharacter opponent)
	{
	    numTurns = attackSpeed/opponent.getAttackSpeed();

		if (numTurns == 0)
			numTurns++;

		System.out.println("Number of turns this round is: " + numTurns);
	}//end battleChoices


}//end Hero class