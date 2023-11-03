import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookName = new TreeSet<>();

        Book b1 = new Book("Savaş ve Barış",1180,"Tolstoy","1867");
        Book b2 = new Book("Suç ve Ceza",704,"Dostoyevski","1866");
        Book b3 = new Book("Madam Bovary",396,"Flaubert","1856");
        Book b4 = new Book("Portre",96,"Gogol","1835");
        Book b5 = new Book("Kolera Günlerinde Aşk",448,"Gabriel García Márquez","1985");

        bookName.add(b1);
        bookName.add(b2);
        bookName.add(b3);
        bookName.add(b4);
        bookName.add(b5);

        System.out.println("\n" + "Order by Name: ");
        Iterator<Book> itr = bookName.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getBookName());
        }


        TreeSet<Book> books = new TreeSet<>(new OrderPageNumberComparator());

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("\n" + "Order by page number: ");
        for (Book page : books){
            System.out.println(page.getPageNumber());
        }
    }
}