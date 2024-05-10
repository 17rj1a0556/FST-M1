--Activity 3
SELECT salesman_id,salesman_city
FROM SALESMAN;

SELECT *
FROM SALESMAN  
WHERE salesman_city = 'Paris';

SELECT salesman_id,commission,salesman_name
FROM SALESMAN  
WHERE salesman_name = 'Paul Adam';