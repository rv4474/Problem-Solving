# Write your MySQL query statement below
select x.Department, x.Employee , x.Salary from (
select d.name as Department, e.name as Employee , e.salary as Salary,
dense_rank() over(partition by d.name order by e.salary desc) as drnk
from Employee as e join Department as d 
on e.departmentId = d.id ) as x
where x.drnk<=3
