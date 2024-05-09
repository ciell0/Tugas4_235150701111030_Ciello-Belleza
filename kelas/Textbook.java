package kelas;

public class Textbook extends Book implements IBookOperations{
    //Atributte
    private String subject;

    //contructor
    public Textbook(String titleInput, String authorInput, int yearInput, String subjectInput){
        super(titleInput, authorInput, yearInput);
        this.subject = subjectInput; 
    }

   //Implements method
   @Override
   public void borrowBook(){
      if (!isBorrowed()) {
       setBorrowed(true);
       System.out.println("Textbook : " + getTitle() + " borrowed successfully.");
       } else {
           System.out.println("Textbook : " + getTitle() + " was borrowed.");
       }
   }

   @Override
   public void returnBook(){
       if (isBorrowed()) {
           setBorrowed(false);
           System.out.println("Textbook : " + getTitle() + " returnd successfully.");
       } else {
           System.out.println("Textbook : " + getTitle() + " is not borrowed.");
       }
   }

    //override super method
    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Subject : " + this.subject);
        System.out.println();
    }
}
