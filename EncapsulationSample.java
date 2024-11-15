public class EncapsulationSample{
    public static void main(String[] args){

    Student student1 = new Student();
    student1.setId(1234);
    student1.setName("Student_1");

    System.out.println("Student Id: " + student1.getId());
    System.out.println("Student Name: " + student1.getName());
    System.out.println("\n");
    Book book1 = new Book();
    book1.setBookNumber(1);
    book1.setTitle("Laws of Motion");
    book1.setAuthor("Isaac Newton");
    book1.setPrice(1250.00);

    System.out.println("Book Number: " + book1.getBookNumber());
    System.out.println("Book Title: " + book1.getTitle());
    System.out.println("Book Author: " + book1.getAuthor());
    System.out.println("Book Price: " + book1.getPrice());
    }
}

    class Student{

        private int Student_Id;
        private String Name;

    public void setId(int s_id){
        this.Student_Id = s_id;
    }
    public void setName(String s_name){
        this.Name = s_name;
    }

    public int getId(){
        return Student_Id;
    }
    public String getName(){
        return Name;
    }
    }

    

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
