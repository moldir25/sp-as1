import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Singleton meat = Singleton.getInstance();
        List<Book> bookList = new ArrayList<>();
        List<Student> StudentList = new ArrayList<>();
        Library library = new Library();
        library.LibraryInfo();
        while (true) {
            System.err.println("Enter key number");
            int n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1 -> library.addNewStudent(StudentList);
                case 2 -> library.addNewBook(bookList);
                case 3 -> library.StudentsINFO(StudentList);
                case 4 -> library.booksINFO(bookList);
                case 5 -> library.giveBook(StudentList, bookList);
                case 6 -> library.returnBook(StudentList, bookList);
                case 7 -> library.close(StudentList, bookList);
                default -> System.out.println("Incorrect number");
            }
        }
    }
}