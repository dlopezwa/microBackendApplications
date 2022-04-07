CREATE TABLE IF NOT EXISTS functionality (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    description varchar(100) NOT NULL,
    url varchar(100) NOT NULL,
    applicationid int NOT NULL,
    CONSTRAINT FK_Functionality FOREIGN KEY (applicationid) REFERENCES application(id)
);