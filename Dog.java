class Dog {
    String name;
    boolean isMale;
    int NumPuppies;
    String puppies[] = new String[2];
    Dog puppy;

    public void setName(String name){
        this.name = name;
    }

    public String showName(){
        return "Name of the dog: " + name;
    }

    public String bark(){
        return name + " Woof!woof!";
    }

    public int setNumberofPuppies(){
        return NumPuppies = puppies.length;
    }

    public String showNumberofPuppies(){
        return "Number of Puppies" + NumPuppies;
    }

    public void setPuppies(int NumPuppies){
        this.NumPuppies = NumPuppies;
    }

    public String[]showPuppies(){
        return puppies;
    }
}
    