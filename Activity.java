class Activity{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("Bella");
        
        dog.puppies[0] = "Max";
        dog.puppies[1] = "Daisy";

        System.out.println(dog.showName());

        System.out.println(dog.bark());

        System.out.println(dog.showNumberofPuppies());

        System.out.println("Puppies: " + dog.showPuppies());
        
    }
}