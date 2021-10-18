package object.master;

public class HumanTest {

	public static void main(String[] args) {
		Ninja player1 = new Ninja();
		Wizard player2 = new Wizard();
		Samurai player3 = new Samurai();
		player1.steal(player3);
		player2.fireball(player1);
		System.out.println(player1.health);
		player2.heal(player1);
		System.out.println(player1.health);
		player3.deathBlow(player1);
		System.out.println(player1.health);
		System.out.println(player2.health);
		System.out.println(player3.health);
		System.out.println(Samurai.howMany());

	}

}
