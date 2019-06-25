package w06OOPs;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	ArrayList <Pokemon> List1= new ArrayList<Pokemon>();	
	List1.add(new Pokemon("pikachu",90,"electric"));
		Player objPlayer = new Player("hello",500, List1);
		//Player hello = new Player("",890,);
		
		objPlayer.getPokemonArray().add(new Pokemon("Pikachu", 100, "Electric"));
		System.out.println("Player : " + objPlayer.toString());
		
		System.out.println(" Player 2 :" + (new Player("hello",50, new ArrayList<Pokemon>())).getPokemonArray()
				.add(new Pokemon("Pikachu", 100, "Electric")));

		
		/*ArrayList<Pokemon> pokeArray = new ArrayList<Pokemon>();
		pokeArray.add(new Pokemon("Pikachu", 100, "Electric"));
		pokeArray.add(new Pokemon("Richu", 100, "Electric"));
		pokeArray.add(new Pokemon("Chalizad", 100, "Fire"));
		objPlayer.setPokemonArray(pokemonArray);
		*/
		
		

	}

}
