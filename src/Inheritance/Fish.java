package Inheritance;

public class Fish extends Animal {
	private int gills;
	private int eyes;
	private int fins;
	
	public Fish(String name,  int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
 private void movemuscles() {
	 
 }
 private void moveBackFins() {
	 
 }
 private void swim(int speed){
	 System.out.println("fish swim at speed  " +  speed);
	 movemuscles();
	 moveBackFins();
	// super.move(3);	  
 }
 
	private void swallow() {
		System.out.println("fish swallows food" );
	}
	
	@Override
	public void eat() {
		System.out.println("Animal.eat called:fish swallow");  
			swallow();
	}
	@Override
	public void move(int speed) {
		System.out.println("Animal.move is called:fish swimms  ");
		swim(7);
	
	   movemuscles(); 
		
	}
	public void rest() {
		System.out.println("fish rests under the sea");
			//move(0);
		
	}
}   
	   
	   

