//start base class libraryitem --attributes--method--subclasses(Book , Magazine, DVD)

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;


    public void checkout() {
        System.out.println("checkout");

    }

    public void returnItem() {
        System.out.println("returning the item");
    }
}

//subclasses

public class Magazine extends LibraryItem {
    private String issueNumber;
}

public class Book extends LibraryItem {
  private String iSBN;

}
