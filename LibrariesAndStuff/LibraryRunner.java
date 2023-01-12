
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library bigLibrary = new Library();
    ArrayList<Book> childrensBooks = bigLibrary.getChildrensBooks();

    String authorToFind = "L. Frank Baum";

    for (Book x : childrensBooks) {
      if (x.getAuthor().equals(authorToFind)) {
        System.out.println(x.getTitle());
      }
    }

    String bookToFind = "Sky Island";
    double minimumRating = 0;
    for (Book y : childrensBooks) {
      if (y.getTitle().equals(bookToFind)) {
        minimumRating = y.getRating();
      }
    }
    System.out.println(minimumRating);
    
    for (Book z : childrensBooks) {
      if (z.getRating() >= minimumRating) {
        System.out.println(z.getTitle() + ", by " + z.getAuthor());
      }
    }
  }
}