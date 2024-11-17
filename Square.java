public class Square extends Rectangle{
    double Side;

public Square(double Side, double Length, double Width, String Color, Boolean Filled){
    super(Side, Side, Color, Filled);
}

public void setSide(double Side){
   this.Length = Length;
   this.Width = Width;
}
public double getSide(){
    return Length;
}
public double getArea(){
    return Length * Length;
}
public double getPerimeter(){
    return 4 * Length;
}
@Override
public String toString(){
    return "Square is color " + Color + " and is Filled: " + Filled + ".";
}

}

