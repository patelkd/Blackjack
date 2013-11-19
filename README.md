Blackjack
=========
public class Person {

	private String name;
	private double stamina; 
	private int health;

	private static int count;

	public Person(String name) {
		// setName(name);
		// this.stamina = 0.5;
		// 
		this(name, 0.5, 50); //references the constructor with name and stamina
	}

	public Person(String name, double stamina, int health) {
		setName(name);
		this.stamina = stamina;
		this.health = health;

		Person.addOne();
	}

	public static void main(String[] args) {
		Person p1 = new Person("Alice"); //uses first constructor...stamina equals 0.5
		Person p2 = new Person("Bob", 0.25); //uses second contructor

	}

	public static addOne() {
		count++;
	}

	public String name() {
		return this.name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public void run() {
		//...
	}

	public void run(int x) {
		//runs x feet
	}



}

http://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
