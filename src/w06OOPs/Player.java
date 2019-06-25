package w06OOPs;

import java.util.ArrayList;

public class Player 
{

	private String name;
	private double money;
	private ArrayList<Pokemon> pokemonArray;
	
	public Player(String name, double money, ArrayList<Pokemon> pokemonArr) {
		this.name = name;
		this.money = money;
		this.pokemonArray = pokemonArr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	
	
	public ArrayList<Pokemon> getPokemonArray() {
		return pokemonArray;
	}

	public void setPokemonArray(ArrayList<Pokemon> pokemonArray) {
		this.pokemonArray = pokemonArray;
	}

	public String toString() {
		
		return this.getName() + " got $" +  this.getMoney() + " and have " + this.getPokemonArray().toString();
	}
	
	
	
}
