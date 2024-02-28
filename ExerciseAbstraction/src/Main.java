//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//      Q1:
//        Book book = new Book("Java", 20.99, "Ali");
//        Movie movie = new Movie("Al-Asuf", 15.99, "Naseer");
//
//
//        System.out.println("Book Name: " + book.getName());
//        System.out.println("Author: " + book.getAuthor());
//        System.out.println("Price: " + book.getPrice());
//        System.out.println("Discount: " + (book.getDiscount() * 100) + "%");
//
//        System.out.println("\nMovie Name: " + movie.getName());
//        System.out.println("Director: " + movie.getDirector());
//        System.out.println("Price: " + movie.getPrice());
//        System.out.println("Discount: " + (movie.getDiscount() * 100) + "%");

        MovablePoint point = new MovablePoint(0, 0, 1, 1);

        point.moveUp();
        point.moveRight();

        System.out.println("New position: (" + point.getX() + ", " + point.getY() + ")");
    }
    }

