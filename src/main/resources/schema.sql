create table if not exists category(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    description VARCHAR(255)
);


create table if not exists product(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    description VARCHAR(255),
    price double,
    categoryId int,
    FOREIGN KEY (categoryId) REFERENCES category(id)
);