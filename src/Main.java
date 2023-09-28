import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Collection of poems", "Esenin");
        Book book2 = new Book(2, "War and peace", "Tolstoy");
        Book book3 = new Book(3, "Pikovaya dama", "Pushkin");
        Book book4 = new Book(4, "Romeo and Juliet", "Shakespeare");
        Book book5 = new Book(5, "Idiot", "Dostoevskiy");
        Book book6 = new Book(6, "Master and Margarita", "Bulgakov");
        Book book7 = new Book(7, "Ivan Vasilevich", "Bulgakov");
        Book book8 = new Book(8, "Dictionary", "Dal");
        Book book9 = new Book(9, "On the bottom", "Gorkiy");
        Book book10 = new Book(10, "Poems", "Tcvetaeva");

        Shelf shelf1 = new Shelf(1, 10);
        Shelf shelf2 = new Shelf(2, 10);
        Shelf shelf3 = new Shelf(3, 10);
        Shelf shelf4 = new Shelf(4, 10);
        Shelf shelf5 = new Shelf(5, 10);


        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        List<String> sortedList = books.stream()
                .map(book -> book.getName())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);


        List<String> firstShelf = sortedList.stream()
                .filter(book -> book.startsWith("A") || book.startsWith("B") || book.startsWith("C")
                        || book.startsWith("D") || book.startsWith("E"))
                .limit(shelf1.getSize())
                .collect(Collectors.toList());


        List<String> secondShelf = sortedList.stream()
                .filter(book -> book.startsWith("F") || book.startsWith("G") || book.startsWith("H")
                        || book.startsWith("I") || book.startsWith("J"))
                .limit(shelf2.getSize())
                .collect(Collectors.toList());

        List<String> thirdShelf = sortedList.stream()
                .filter(book -> book.startsWith("K") || book.startsWith("L") || book.startsWith("M")
                        || book.startsWith("N") || book.startsWith("O"))
                .limit(shelf3.getSize())
                .collect(Collectors.toList());

        List<String> fourthShelf = sortedList.stream()
                .filter(book -> book.startsWith("P") || book.startsWith("Q") || book.startsWith("R")
                        || book.startsWith("S") || book.startsWith("T"))
                .limit(shelf4.getSize())
                .collect(Collectors.toList());

        List<String> fifthShelf = sortedList.stream()
                .filter(book -> book.startsWith("U") || book.startsWith("V") || book.startsWith("W")
                        || book.startsWith("X") || book.startsWith("Y") || book.startsWith("Z"))
                .limit(shelf5.getSize())
                .collect(Collectors.toList());


        System.out.println(firstShelf);
        System.out.println(secondShelf);
        System.out.println(thirdShelf);
        System.out.println(fourthShelf);
        System.out.println(fifthShelf);


    }
}
