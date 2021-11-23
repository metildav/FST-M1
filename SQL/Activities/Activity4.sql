REM   Script: Activity 4
REM   FST Training Activity 4

SELECT * FROM salesman;

-- Add the grade column
ALTER TABLE salesman ADD grade int;



-- Update the values in the grade column
UPDATE salesman SET grade=100;


SELECT * FROM salesman


