USE adlister_db;

CREATE TABLE IF NOT EXISTS users(
                      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      username VARCHAR(200) NOT NULL,
                      email VARCHAR(200) NOT NULL,
                      password VARCHAR(200) NOT NULL,
                      PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ads(
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    user_id INT UNSIGNED NOT NULL ,
                    title VARCHAR(100) NOT NULL,
                    description TEXT NOT NULL,
                    PRIMARY KEY (id),
                    FOREIGN KEY (user_id) REFERENCES users(id)
);