import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //Instantiating albums
        Album album1 = new Album(1, "Michael Jackson", "Thriller", 1982, 51.2, "Pop");
        Album album2 = new Album(2, "AC/DC", "Back in Black", 1980, 30.10, "Hard rock");
        Album album3 = new Album(3, "Pink Floyd", "The Dark Side of the Moon", 1973, 24.80, "Progressive rock");
        Album album4 = new Album(4, "Eagles", "Their Greatest Hits 1971–1975", 1976, 41.20, "Country rock");
        System.out.println(album1.getId());
        System.out.println(album1.getArtist());
        ArrayList<Album> albums = new ArrayList<>(Arrays.asList(album1, album2, album3, album4));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album1));

        // Instantiating Authors
        Author author1 = new Author(1, "Benny", "Para");
        Author author2 = new Author(2, "Julius", "Cesear");
        Author author3 = new Author(3, "Ichigo", "Satoru");
        ArrayList<Author> authors = new ArrayList<>(Arrays.asList(author1, author2, author3));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(authors));

        // Instantiating Quotes
        Quote quote1 = new Quote(1, author1, "It comes and it goes.");
        Quote quote2 = new Quote(2, author1, "Lovey day isn't it?");
        Quote quote3 = new Quote(3, author3, "Polly wanna cracker?");
        Quote quote4 = new Quote(4, author2, "Shrooms, Shrooms the magical fruit");
        Quote quote5 = new Quote(5, author3, "I can't feel my face.");

        ArrayList<Quote> quotes = new ArrayList<>(Arrays.asList(quote1, quote2, quote3, quote4, quote5));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(quotes));
//        for(Quote quote : quotes) {
//            System.out.printf("%nAuthor: %s %s%nQuote: %s%n%n", quote.getAuthor().getFirstName(), quote.getAuthor().getLastName(), quote.getContent());
//        }

    }
}
