public class Main{
	public static void main(String[] args){
        
        Dog dog = new Dog();
        dog.name = "Bella";
        dog.isMale = false;
        
        Dog puppy1 = new Dog();
        puppy1.name = "Eloy";
        dog.setPuppies(puppy1);
        
        Dog puppy2 = new Dog();
        puppy2.name = "Bea";
        dog.setPuppies(puppy2);
        
        dog.puppies[0] = puppy1;
        dog.puppies[1] = puppy2;
        
    System.out.println(dog.showName());
    System.out.println("Dog is Male: " + dog.showisMale());
    System.out.println(dog.bark());
    System.out.println("Number of Puppies: " + dog.shownumofPuppies());
    
        for(int i = 0; i < dog.showPuppies().length; i++){
        	if(dog.showPuppies()[i] != null){
        	
            System.out.println("Name of Puppies: " + dog.showPuppies()		[i].name);
            }
        }
    }
}
