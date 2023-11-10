import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Savaş ve Barış",1180,"Tolstoy","1867"));
        list.add(new Book("Suç ve Ceza",704,"Dostoyevski","1866"));
        list.add(new Book("Madam Bovary",396,"Flaubert","1856"));
        list.add(new Book("Portre",96,"Gogol","1835"));
        list.add(new Book("Kolera Günlerinde Aşk",448,"Gabriel García Márquez","1985"));

/*      Map<String,String> bookMap = new HashMap<>();
        Map kullanarak listeleme:
        bookMap.put(b1.getBookName(), b1.getBookAuthor()+"\n");
        bookMap.put(b2.getBookName(), b2.getBookAuthor()+"\n");
        bookMap.put(b3.getBookName(), b3.getBookAuthor()+"\n");
        bookMap.put(b4.getBookName(), b4.getBookAuthor()+"\n");
        bookMap.put(b5.getBookName(), b5.getBookAuthor()+"\n");
        System.out.println(bookMap);*/

        Map<String,String> bookMap = new HashMap<>();
        list.forEach(book -> bookMap.put(book.getBookName(),book.getBookAuthor()));
        bookMap.forEach((bookName,bookAuthor)-> System.out.println("Book name: " + bookName + " , Author:" + bookAuthor));
        System.out.println();

        Map<String,String> newBookMap = new HashMap<>();
        list.stream().filter(book -> book.getPageNumber()>500).forEach(book -> newBookMap.put(book.getBookName(),book.getBookAuthor()));
        newBookMap.forEach((bookName,bookAuthor)-> System.out.println("Book name: " + bookName + " , Author:" + bookAuthor));

    }
}