public class Rectangle extends Shape{
    double Length;
    double Width;

public Rectangle(double Length, double Width, String Color, Boolean Filled){
this.Length = Length;
this.Width = Width;
this.Color = Color;
this.Filled = Filled;
}

public void setLength(double Length){
    this.Length = Length;
}
public void setWidth(double Width){
    this.Width = Width;
}
public double getLength(){
    return Length;
}
public double getWidth(){
    return Width;
}
public double getArea(){
    return Length * Width;
}
public double getPerimeter(){
    return 2 * Length + Width;
}

public String toString(){
    return "Rectangle is color " + Color + " and is Filled: " + Filled + ".";
}
}