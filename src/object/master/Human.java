package object.master;

public class Human {
	public int strength = 3;
	public int stealth =3;
	public int intelligence =3;
	public int health=100;
	
	public Human attack(Human enemy) {
		enemy.health -= this.strength;
		return enemy;
	}
	
}
