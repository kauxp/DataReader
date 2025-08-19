import java.util.*;

public class Driver {
    public static void main(String[] args) {
        List<Book> books = DataReader.loadBooks("BestsellersWithCategories.csv");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter author name:");
        String auth = sc.nextLine();
        System.out.println("Books by " + auth + ": " + countByAuthor(books, auth));

        System.out.println("\nAll Authors:");
        showAuthors(books);

        System.out.println("\nEnter author name to list their books:");
        auth = sc.nextLine();
        showBooksByAuthor(books, auth);

        System.out.println("\nEnter rating:");
        double rate = sc.nextDouble();
        showBooksByRating(books, rate);

        sc.nextLine(); 
        System.out.println("\nEnter author name to list book prices:");
        auth = sc.nextLine();
        showPriceByAuthor(books, auth);
    }

    public static int countByAuthor(List<Book> books, String auth) {
        int c = 0;
        for (Book b : books) {
            if (b.getWriter().equalsIgnoreCase(auth)) c++;
        }
        return c;
    }

    public static void showAuthors(List<Book> books) {
        Set<String> authSet = new HashSet<>();
        for (Book b : books) {
            authSet.add(b.getWriter());
        }
        for (String a : authSet) {
            System.out.println(a);
        }
    }

    public static void showBooksByAuthor(List<Book> books, String auth) {
        for (Book b : books) {
            if (b.getWriter().equalsIgnoreCase(auth)) {
                System.out.println(b.getName());
            }
        }
    }

    public static void showBooksByRating(List<Book> books, double rate) {
        for (Book b : books) {
            if (b.getRating() == rate) {
                b.showInfo();
            }
        }
    }

    public static void showPriceByAuthor(List<Book> books, String auth) {
        for (Book b : books) {
            if (b.getWriter().equalsIgnoreCase(auth)) {
                System.out.println(b.getName() + " - $" + b.getCost());
            }
        }
    }
}
