CREATE TABLE IF NOT EXISTS functionality (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    description varchar(50) NOT NULL,
    url varchar(50) NOT NULL,
    applicationid int NOT NULL,
    FOREIGN KEY (applicationid) REFERENCES application(id)
);
