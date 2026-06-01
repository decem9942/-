package curriculumG;

import java.util.Random;

public class Hero extends Character {
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;

	public Hero(String name) {
		super(name);

		Random random = new Random();

		this.hp = random.nextInt(1000);
		this.mp = random.nextInt(1000);
		this.attack = random.nextInt(1000);
		this.speed = random.nextInt(1000);
		this.defense = random.nextInt(1000);
	}

	public int getHp() {
		return this.hp;
	}

	public void setHP(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMP(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return this.attack;
	}

	public void setAttacak(int attack) {
		this.attack = attack;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefense() {
		return this.defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}