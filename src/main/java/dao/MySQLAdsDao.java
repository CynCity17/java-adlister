package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements  Ads {
    private Connection connection;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword());
        } catch (SQLException sqlx) {
            throw new RuntimeException("Error connecting to db", sqlx);
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while (resultSet.next()) {
                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException sqlx) {
            throw new RuntimeException("error connecting to db", sqlx);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO ads (user_id, title, description) VALUES (" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "')", Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                return resultSet.getLong(1);
            }
        } catch (SQLException e){
        throw new RuntimeException("error connecting to db", e);
        }
        return null;
    }


}
