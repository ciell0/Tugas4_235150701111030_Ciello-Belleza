package kelas;

public class Magazine extends Book implements IBookOperations{
    //Attributte
    private String category;

    //constructor
    public Magazine(String titleInput, String authorInput, int yearInput, String categoryInput){
        super(titleInput, authorInput, yearInput);
        this.category = categoryInput;
    }

    //Implements method
    @Override
    public void borrowBook(){
       if (!isBorrowed()) {
        setBorrowed(true);
        System.out.println("Magazine : " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Magazine : " + getTitle() + " was borrowed.");
        }
    }

    @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine : " + getTitle() + " returnd successfully.");
        } else {
            System.out.println("Magazine : " + getTitle() + " is not borrowed.");
        }
    }

    //override super method
    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Category : " + this.category);
        System.out.println();
    }
}
