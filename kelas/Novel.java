package kelas;

public class Novel extends Book implements IBookOperations{
    //Attributte
    private String genre;

    //constructor
    public Novel(String titleInput, String authorInput, int yearInput, String genreInput){
        super(titleInput, authorInput, yearInput);
        this.genre = genreInput;
    }

    //Implements method
    @Override
    public void borrowBook(){
       if (!isBorrowed()) {
        setBorrowed(true);
        System.out.println("Novel : " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Novel : " + getTitle() + " was borrowed.");
        }
    }

    @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel : " + getTitle() + " returnd successfully.");
        } else {
            System.out.println("Novel : " + getTitle() + " is not borrowed.");
        }
    }

    //override super method
    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Genre : " + this.genre);
        System.out.println();
    }
}
