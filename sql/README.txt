#useful basic relational (table) commands
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
