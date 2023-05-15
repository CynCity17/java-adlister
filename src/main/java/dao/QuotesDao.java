package dao;

import com.mysql.cj.jdbc.Driver;
import models.Author;
import models.Quote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes{
    private Connection connection;
    public QuotesDao(){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bigfoot_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");
        }catch (SQLException sqlx){
            throw new RuntimeException("Error connecting to db", sqlx);
        }
    }
    @Override
    public List<Quote> all() {
        Authors authorsDao = new AuthorsDao();
        List<Author> authors = authorsDao.all();
        List<Quote> quotes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM bigfoot_test_db.quotes");
            while (resultSet.next()){
                int author_id = resultSet.getInt("id");
                Author quoteAuthor = null;
                for(Author author : authors){
                    if(author.getId() == author_id){
                        quoteAuthor = author;
                    }
                }
                Quote quote = new Quote(
                        resultSet.getLong("id"),
                        resultSet.getString("content"),
                        quoteAuthor);
                quotes.add(quote);
            }
        } catch (SQLException e){
            throw new RuntimeException("error connecting to db", e);
        }
        return quotes;
    }

    @Override
    public void insert(Quote quote){

    }
}
