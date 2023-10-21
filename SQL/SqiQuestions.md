# SQL DB Operations

- CREATE DATABASE Student;
- USE Student;
- CREATE TABLE Scores (
    ID INT PRIMARY KEY,
    Phy INT,
    Chem INT,
    Maths INT,
);
- INSERT INTO Scores (ID, Phy, Chem, Maths)
VALUES (1, 90, 85, 78),
       (2, 88, 92, 75),
       (3, 95, 79, 88),
       (4, 82, 76, 90);

- ALTER TABLE Scores
- ADD Biology INT;

- UPDATE Scores
  SET Biology = 80
  WHERE ID = 1;

- UPDATE Scores
  SET Biology = 72
  WHERE ID = 2;

- UPDATE Scores
  SET Biology = 63
  WHERE ID = 3;

- UPDATE Scores
  SET Biology = 86
  WHERE ID = 4;

- SELECT ID
FROM Scores
ORDER BY Phy DESC
LIMIT 1;

- SELECT ID
FROM Scores
ORDER BY (Phy + Chem + Maths + Biology) DESC
LIMIT 1;

- SELECT ID
FROM Scores
ORDER BY (Phy + Chem + Maths + Biology) ASC;

- SELECT ID
FROM Scores
ORDER BY (Phy + Chem + Maths + Biology) DESC;

- [ SELECT ID
FROM Scores
ORDER BY Maths DESC
LIMIT 1 OFFSET 1;] 
 OR 
[SELECT MAX(Maths) AS SecondHighestMathScore
FROM Scores
WHERE Maths < (SELECT MAX(Maths) FROM Scores);]