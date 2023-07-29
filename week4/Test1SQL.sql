CREATE DATABASE SampleDB;
use SampleDB;

CREATE TABLE Customers (
    CustomerID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Age INT,
    Email VARCHAR(100)
);

CREATE TABLE Products (
    ProductID INT AUTO_INCREMENT PRIMARY KEY,
    ProductName VARCHAR(100),
    Price DECIMAL(10, 2),
    Quantity INT
);

CREATE TABLE Orders (
    OrderID INT AUTO_INCREMENT PRIMARY KEY,
    CustomerID INT,
    ProductID INT,
    OrderDate DATE,
    Quantity INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-- Thêm dữ liệu vào bảng Customers
INSERT INTO Customers (FirstName, LastName, Age, Email) VALUES
    ('John', 'Doe', 30, 'john.doe@example.com'),
    ('Jane', 'Smith', 25, 'jane.smith@example.com'),
    ('Michael', 'Johnson', 35, 'michael.johnson@example.com'),
    ('Emily', 'Brown', 28, 'emily.brown@example.com'),
    ('William', 'Davis', 40, 'william.davis@example.com');

-- Thêm dữ liệu vào bảng Products
INSERT INTO Products (ProductName, Price, Quantity) VALUES
    ('Laptop', 1000.00, 50),
    ('Smartphone', 800.00, 100),
    ('Headphones', 100.00, 200),
    ('Keyboard', 50.00, 150),
    ('Mouse', 30.00, 250);

-- Thêm dữ liệu vào bảng Orders
INSERT INTO Orders (CustomerID, ProductID, OrderDate, Quantity) VALUES
    (1, 2, '2023-07-20', 2),
    (2, 1, '2023-07-21', 1),
    (3, 3, '2023-07-21', 3),
    (4, 4, '2023-07-22', 2),
    (5, 5, '2023-07-22', 4);

SELECT * FROM Orders;
SELECT ProductName, Price  FROM Products;

SELECT * FROM Products WHERE ProductName LIKE '%Laptop%';
SELECT * FROM Products WHERE ProductName = 'Laptop';

SELECT COUNT(*) FROM Orders WHERE ProductID IN (SELECT ProductID FROM Products WHERE Price > 1000);
SELECT COUNT(*) FROM Orders o
JOIN Products p ON o.ProductID = p.ProductID
WHERE p.Price > 1000;

SELECT * FROM Customers WHERE Age > 30 AND LastName LIKE 'S%';
CREATE INDEX idx_LastName ON Customers (LastName);

SELECT * FROM Orders WHERE Year(OrderDate) = 2023;
SELECT * FROM Orders WHERE OrderDate BETWEEN '2023-01-01' AND '2023-12-31';

