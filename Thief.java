
public class Thief extends Hero {
	 public Thief(String name, AttackBehavior attack)
		{
			super(name, 75, 6, .8, 20, 40, 5, .5, attack);



	    }

		public void surpriseAttack(DungeonCharacter opponent)
		{
			double surprise = Math.random();
			if (surprise <= .4)
			{
				System.out.println("Surprise attack was successful!\n" +
									getName() + " gets an additional turn.");
				addTurns();
				attack(opponent);
			}
			else if (surprise >= .9)
			{
				System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
									" blocked your attack!");
			}
			else
			    attack(opponent);


		}


	    public void battleChoices(DungeonCharacter opponent)
		{
			super.battleChoices(opponent);
			int choice;


			do
			{
			    System.out.println("1. Attack Opponent");
			    System.out.println("2. Surprise Attack");
			    System.out.print("Choose an option: ");
			    choice = getKeyBoard().nextInt();

			    switch (choice)
			    {
				    case 1: attack(opponent);
				        break;
				    case 2: surpriseAttack(opponent);
				        break;
				    default:
				        System.out.println("invalid choice!");
			    }//end switch

				killTurn();
				if (getNumTurns() > 0)
				    System.out.println("Number of turns remaining is: " + getNumTurns());

			} while(getNumTurns() > 0);

	    }
}
