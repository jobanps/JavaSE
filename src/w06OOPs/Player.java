package w06OOPs;

public class Player {

	private String name;
	private double money;
	private Pokemon pokemon;
	
	public Player(String name, double money, Pokemon pokemon) {
		this.name = name;
		this.money = money;
		this.pokemon = pokemon;
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
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public String toString() {
		
		return this.getName() + " got $" +  this.getMoney() + " and have " + this.getPokemon().toString();
	}
	
	
	
}
