public class AcademicBook extends Book{
    private String subject;

    AcademicBook(){

    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

    // Getter & setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Override getMediaType() method from the super class Media
    public String getMediaType(){
        String message ;
        if(isBestSeller()) {
            message = "Bestselling AcademicBook";
        }else {
            message = "AcademicBook";
        }
        return message;
    }

    @Override
    public String toString() {
        return super.toString() // Override toString() method from the super class Media
                +"\nAcademicBook subject: " + subject;
    }
}