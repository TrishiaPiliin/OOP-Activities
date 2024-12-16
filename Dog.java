class Dog{
        String name;
        boolean isMale;
        int numofPuppies;
        Dog[] puppies = new Dog[2];
        Dog puppy;
        
    public void setName(String name){
        this.name = name;
    }
    public String showName(){
        return "Name of the dog: " + name;
    }
    
    public void setisMale(boolean isMale){
        this.isMale = isMale;
    }
    public boolean showisMale(){
        return isMale;
    }
    
    public String bark(){
        return "Woof!, Woof!";
    }
    
    public void setnumofPuppies(int numofPuppies){
        this.numofPuppies = numofPuppies;
    }
    public int shownumofPuppies(){
        return numofPuppies;
    }
    
    public void setPuppies(Dog puppy){
        for(int i = 0; i < puppies.length; i++){
        	if(puppies[i] == null){
            puppies[i] = puppy;
            numofPuppies++;
            break;
    	}
    	}
    }
    public Dog[] showPuppies(){
        return puppies;
    }
}
