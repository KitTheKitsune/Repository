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
