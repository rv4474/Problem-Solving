# Write your MySQL query statement below
SELECT 
    subquery.project_id AS project_id, 
    round(AVG(subquery.experience_years),2) AS average_years 
FROM 
    (
        SELECT 
            p.project_id, 
            e.experience_years 
        FROM 
            Project AS p 
        JOIN 
            Employee AS e 
        ON 
            p.employee_id = e.employee_id
    ) AS subquery
GROUP BY 
    subquery.project_id;
