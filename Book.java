class Book{

    private int book_Number;
    private String title;
    private String author;
    private double price;

public void setBookNumber(int book_Number){
    this.book_Number = book_Number;
}
public void setTitle(String title){
    this.title = title;
}
public void setAuthor(String author){
    this.author = author;
}
public void setPrice(double price){
    this.price = price;
}

public int getBookNumber(){
    return book_Number;
}
public String getTitle(){
    return title;
}
public String getAuthor(){
    return author;
}
public double getPrice(){
    return price;
}
}