package com.codeup.adlister.dao;

import config.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Users getUserDao(){
        if (usersDao == null){
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
