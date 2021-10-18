package object.master;

public class Samurai extends Human{
	private static int number =0;
	public Samurai() {
		this.health = 200;
		number +=1;
	}
	
	public void deathBlow(Human enemy) {
		this.health = this.health/2;
		enemy.health = 0;
		 System.gc();
		
	}
	
	public void meditate() {
		this.health *=1.5;
	}
	
	public static int howMany() {
		return number;
	}
	
}
