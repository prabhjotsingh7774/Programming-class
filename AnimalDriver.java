package Lab10;

public class AnimalDriver {

	public static void main(String[] args) {
//Creating objects of above classes
	    
	    Cat c = new Cat("Kitty");
	    
	    Dog d1 = new Dog("Tommy");
	    
	    Dog d2 = new Dog("Puppy");
	    
	    BigDog bd1 = new BigDog("Milo");
	    
	    BigDog bd2 = new BigDog("Buddy");
	    
	    
	    //Calling greets function.
	    c.greets();
	    
	    d1.greets();
	    
	    d1.greets(d2);
	    
	    bd1.greets();
	    
	    bd1.greets(d1);
	    
	    bd1.greets(bd2);
	}

}
