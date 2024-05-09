package objek;
import kelas.*;

public class Main {
    public static void main(String[] args) {

        Textbook textbook = new Textbook("Java OOP", "Fakultas Ilmu Komputer UB", 2019, "Technology");
        Novel novel = new Novel("Percy Jackson and the Olympians", "Rick Riordan", 2019, "Fantasy");
        Magazine magazine = new Magazine("Fortiers Magazine", "Poets & Writers", 2020, "Politics");
        
        System.out.println("---- Book Information ----");
        textbook.DisplayInfo();
        novel.DisplayInfo();
        magazine.DisplayInfo();


        System.out.println("---- Borrowing and Returning Books ----");
        //textbook dipinjam dan dikembalikan
        textbook.borrowBook();
        textbook.returnBook();

        //Novel tidak dipinjam, namun dikembalikan
        novel.returnBook();

        //berjenis Magazine telah dipinjam, namun tidak dikembalikan
        magazine.borrowBook();
    }
}
