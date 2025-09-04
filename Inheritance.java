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

//subclasses1

public class Magazine extends LibraryItem {
    private String issueNumber;
}

//subclasses2

public class Book extends LibraryItem {
  private String iSBN;

}

//subclasses3
public class DVD extends LibraryItem {
    private int duration;
}

//create Arrayoperation with static nested class statistics...methods like mean() , median()
