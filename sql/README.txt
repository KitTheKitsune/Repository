#useful basic queries
CREATE TABLE table (
  id DATA_TYPE CONSTRAINT
);
#common CONSTRAINTS include: PRIMARY KEY, UNIQUE, NOT NULL, DEFAULT data

#pulls all data from the table
SELECT * FROM table;

#adds a new column into the table
ALTER TABLE table
ADD COLUMN column
DATA_TYPE;

#adds a new row into the table
INSERT INTO table (column, column, column)
VALUES (data, data, data)

#changes the value at a row and column
UPDATE table
SET column = data
WHERE id = row_data;

#removes rows from a table when they have data at a column
DELETE FROM table
WHERE column IS data;


#allows us to filter out repeat entries
SELECT DISTINCT *
FROM table;

#allows us to filter out based on our own results
SELECT *
FROM table
WHERE data > value;

#allows us to filter into a pattern
SELECT *
FROM table
WHERE column LIKE pattern
#patterns appear as specific chars and wildcard '_' values
#'12__' would return all values of 1200, 1201, 1299, 12aq, 12t6, etc.
#'%' wildcard returns 0 or more chars so 'A%' returns all values that start with 'A'


#return a range
SELECT *
FROM table
WHERE column BETWEEN data AND data

#multiple filters
SELECT *
FROM table
WHERE data = value
AND column < value

#sort results
SELECT * 
FROM table
ORDER BY name DESC;
#DESC reverses the normal order

#returns a limited number of results
SELECT *
FROM table
LIMIT number;

#case statement
SELECT *,
  CASE
    WHEN condition THEN result
    WHEN condition THEN result
    ELSE result
  END
FROM table;

#aggregate data
SELECT SUM(column)
FROM table
WHERE condition;
#other aggregates include: SUM(), COUNT(), MAX(), MIN(), AVG(), ROUND()

#combines rows with similar data
SELECT AVG(column)
FROM table
GROUP BY column;

#GROUP BY can be used with aggregates, but is not fun to write out so you can use numbers to refer to which column
SELECT column, column, column
FROM table
GROUP BY 2;

#when filtering by groups you must use HAVING instead of WHERE
SELECT column, column, aggregate
FROM table
HAVING aggregate > value;

#to pull data from two tables with shared columns
SELECT * FROM table
JOIN table
ON table.column = table.column;
#you can also use LEFT JOIN, RIGHT JOIN to keep non-matching data

#perform a CROSS JOIN to pair every combination of one table to another
SELECT table.column, table.column
FROM table
CROSS JOIN table;

#if you have two tables with the same types of data in the exact same order you can combine them 
SELECT * FROM table
UNION
SELECT * FROM table;

#to combine aggregates you use WITH to create a table containing aggregate information
WITH table AS (
  SELECT foreign_key,
  aggregate
)
SELECT * FROM table
JOIN table
ON table.primary_key = table.foreign_key;
