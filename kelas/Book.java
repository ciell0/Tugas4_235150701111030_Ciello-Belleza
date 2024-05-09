package kelas;

public class Book {

    // Atributte
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    //constructor
    public Book (String titleInput, String authorInput, int yearInput){
        this.title = titleInput;
        this.author = authorInput;
        this.year = yearInput;
    }

    //getter & setter title
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String titleInput) {
        this.title = titleInput;
    }

    //getter & setter author
    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //getter & setter year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //implement method
    public boolean isBorrowed(){
        return this.borrowed;
    }

    public void setBorrowed(boolean borrowedInput) {
        this.borrowed = borrowedInput;
    }

    public void DisplayInfo(){
        System.out.println("Title\t: " + getTitle());
        System.out.println("Author\t: " + getAuthor());
        System.out.println("Year\t: " + getYear());
        System.out.println("Borrowed : " + isBorrowed());
    }
}
