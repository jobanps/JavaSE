package w06OOPs;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pokemon> pokeArray = new ArrayList<Pokemon>();
		pokeArray.add(new Pokemon("Pikachu", 100, "Electric"));
		pokeArray.add(new Pokemon("Richu", 100, "Electric"));
		pokeArray.add(new Pokemon("Chalizad", 100, "Fire"));
		
		Player objPlayer = new Player("Jobanpreet", 1000, pokeArray);
		
		System.out.println("Player : " + objPlayer.toString());

	}

}
