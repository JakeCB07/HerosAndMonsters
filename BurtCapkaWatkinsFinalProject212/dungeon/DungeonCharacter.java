package dungeon;

import java.util.Scanner;

public abstract class DungeonCharacter {

	private String name;
	private int maxHP;
	private int hitPoints;
	private int attackSpeed;
	private AttackBehavior attackBehavior;
	private static Scanner Keyboard = new Scanner(System.in);

	DungeonCharacter(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior) {

		setName(name);
		setHitPoints(hitPoints);
		setMaxHitPoints(hitPoints);
		setAttackSpeed(attackSpeed);
		setAttackBehavior(attackBehavior);
	}

	public static Scanner getKeyBoard() {
		return Keyboard;
	}

	public void setMaxHitPoints(int hp) {
		this.maxHP = hp;
	}
	
	public int getMaxHitPoints() {
		return this.maxHP;
	}
	
	public void setAttackBehavior(AttackBehavior attack) {
		this.attackBehavior = attack;
	}

	public AttackBehavior getAttackBehavior() {
		return this.attackBehavior;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHitPoints(int hitPoints) {

		this.hitPoints = hitPoints;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public boolean isAlive() {
		return (this.hitPoints > 0);
	}// end isAlive method
	
}
