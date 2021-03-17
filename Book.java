/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @Frank (Insert your name here.)
 * @2021/03/09 (Insert today's date here.)
 */
class Book {
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages) {
        author = bookAuthor;
        title = bookTitle;
        refNumber = "";
        pages = bookPages;
        borrowed = 0;
        courseText = true;
    }

    /**
     * Their are methods
     */
    //to set the referance number.
    public void setRefNumber(String input) {
        int a = input.length();
        if (a <= 3) {
            System.out.println("this is error");            
        }
        else{
            refNumber = input;
        }
    }
    //print out the referance number
    public void getRefNumber() {
        System.out.println(refNumber);
    }
    //print out the author name
    public void printAuthor() {
        System.out.println(author);
    }
    //print out the book title
    public void printTitle() {
        System.out.println(title);
    }
    //accessor of pages
    public int getPages() {
        return pages;
    }
    //print out the book information
    public void printDetails() {
        System.out.print("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Refnumber: ");
        if (refNumber.equals("")) {
            System.out.println("---");
        } 
        else {
            System.out.println(refNumber);
        }
    }
    //increase the borrowed
    public int borrow() {
        borrowed = borrowed + 1;
        return borrowed;
    }
    //print out the borrow number
    public void getBorrow() {
        System.out.println(borrowed);
    }
    //show if is textbook
    public boolean isCourseText() {
        if (courseText == true) {
            System.out.println("Yes, a textbook");
        }
        else{
            System.out.println("Not a textbook");
        }
        return courseText;
    }
    //set the book type
    public boolean changeCourseText(boolean type) {
        courseText = type;
        return courseText;
    }
}
