package object.master;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence=8;
	}
	public void heal(Human patient) {
		patient.health += this.intelligence;
	}
	
	public void fireball(Human enemy) {
		enemy.health -= 3*this.intelligence;
	}
	
	
}
