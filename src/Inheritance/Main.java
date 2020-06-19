package Inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal  = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Yokie",8,20,2,4,1,20,"long silky");
		Fish tilapia = new Fish("tilapai",1,1,10,12,2);
		
		dog.eat();
		dog.walk();    
		dog.run();
		tilapia.eat();
		tilapia.move(7); 
		tilapia.rest();

}
}