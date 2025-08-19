import java.io.*;
import java.util.*;

public class DataReader {

    public static List<Book> loadBooks(String filePath) {
        List<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                if (parts.length == 7) {
                    String name = parts[0].replace("\"", "");
                    String writer = parts[1];
                    double rating = Double.parseDouble(parts[2]);
                    int reviewCount = Integer.parseInt(parts[3]);
                    int cost = Integer.parseInt(parts[4]);
                    int pubYear = Integer.parseInt(parts[5]);
                    String type = parts[6];

                    books.add(new Book(name, writer, rating, reviewCount, cost, pubYear, type));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return books;
    }
}
