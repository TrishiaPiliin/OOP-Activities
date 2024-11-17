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
