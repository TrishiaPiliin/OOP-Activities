public abstract class Shape{
    protected String Color;
    protected Boolean Filled;

public void setColor(String Color){
    this.Color = Color;
}
public void setFilled(Boolean Filled){
    this.Filled = Filled;
}
public String getColor(){
    return Color;
}
public Boolean isFilled(){
    return Filled;
}
public abstract double getArea();
public abstract double getPerimeter();

public String toString(){
    return "color " + Color + " and is Filled: " + Filled + ".";
}

}