package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		
		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		spongebob.eat();
		spongebob.laugh();
		patrick.getName();
		squidward.getName();
		patrick.eat();
		squidward.eat();
		patrick.laugh();
		squidward.laugh();
		
	}
	
}
