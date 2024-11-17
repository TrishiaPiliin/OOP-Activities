public class Circle extends Shape{ 
    double Radius;
   
public Circle(double Radius, String Color, Boolean Filled){
this.Radius = Radius;
this.Color = Color;
this.Filled = Filled;
}

public void setRadius(double Radius){
    this.Radius = Radius;
}
public double getRadius(){
    return Radius;
}
public double getArea(){
    return 3.14 * Math.pow(Radius, 2);
}
public double getPerimeter(){
    return 2 * 3.14 * Radius;
}
@Override
public String toString(){
    return "Circle is color " + Color + " and is Filled: " + Filled + ".";
}
      
}
