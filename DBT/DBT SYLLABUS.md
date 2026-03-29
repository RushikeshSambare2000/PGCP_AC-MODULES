###         **DBT SYLLABUS** 



1. Diff between DBMS and RDBMS. 
2. What is MySQL and tools of MySQL 
   - mysql database
   - mysql-pL
   - mysql command line client
   - mysql workbench
   - mysql enterprise backup
   - mysql connector
   - mysql excel
   - mysql notifier
   - mysql enterprise high availability
   - mysql enterprise monitor
   - mysql query analyzer
3. Division of SQL (DDL, DML, DCL, DQL, TCL/DTL). 
      TOTAL 16 
      9 - COMMON - 
      5 - MYSQL ORACLE
      2 - ORACLE
   DDL- create, alter, drop  , truncate(only for mysql and oracle)
   DML- insert, update , delete ,
   DCL- grant and revoke
   DQL- select 
   TCL/DTL- commit, savepoint and rollback
   in oracle only - merge and upsert
   auto commit - 
4. Rules of table name .
 - max 30 char
5. MySQL datatypes
 - char 
 - varchar
 - text (tinytext, text , medium text, long text)
 - binary
 - blob(binary large object) (tinyblob, blob, medium blob, long blob)
 - integer (signed or unsigned) 
 - floating-point 
 - decimal
 - boolean
 - date and time
 - datetieme
 - yea
6. create table, insert, select   
7. operators (arithmetic, logical and relational)
   -relational
   >
   >=
   <
   <=
   !=---<>
   =

   Logical
    Not
    AND
    OR

8. alias 
9. distinct
10. Order by 
   asc
   desc
11. exit


*************session 3**************
12. Special operator (like, between, any, in)
   like- pattern matching
   between - to search in range
   any -
   in  -
13. update, delete, drop, truncate
14. MySQL transaction processing(rollback, commit, savepoint)
14. Row locking(optimistic and pessimistic)
   user 1                 user 2
   update row 1           row 1 lock (cant update cant delete, cant view updated data)
   commit                 after commit in user1 now user2 can view update and delete
15. char function 
   a. concat(fname, lname) --->'rushi' 'sambare' --- rushisambare
   b. upper(fname)  RUSHI---> rushi
   c. lpad(ename, 25, ' ') ---> ----------ename(right justification)  and rpad() ename--------- (left justification)
   d. rtrim(ename)
   e. trim(ename) 
   f. substr(ename,2,4) 
   g. replace(ename, 'un', 'rm')  --> arun --> arrm
   h. length(ename)     cdac --- 4
   i. ascii(ename)      amrin--->97 ascii(A)-->65
   j. char(65 using utf8)          -->a
   k. soundex(ename)  arun               
15. Number functions
  a. round(num), round(num,1)... 1 is decimal point, round(num, -2).. round to nearest hundred
  b. Truncate(num, 0)  122.22 --> 122
  c. ceil(num)         122.56 --> 123
  d. floor(num)        122.56 --> 122
  e. sign(-15)         return -1 for negative, 1 for positive, 0 for zero
  f. mod(9,5)          return reminder  4
  g. sqrt(81)          return 9
  h. power(10,3)       10*10*10 = 1000
  i. abs(-15)          15  convert to positive
16. List Functions
  a. ifnull(col, 0)      ---> return 0 if null
  b. greatest(col, 3000) ---> return gratest value
  c. least(sal, 3000)


*************session 4**************

17. case expression
    select deptname, dept no
    case 
    when deptno=0 then "dept no is zero",
    when deptno=1 then "dept no is one,
    when deptno=2 then "dept no is two",
    else status"none"
    end "status";
18. date functions 
  a. sysdat() --- return server date
  b. now()    --- return before statement 
  c. adddate('1999-10-01', 1) --- 1999-10-02
  d. datediff(1999-10-23, 1999-10-24)       --- 1
  e. date_add(1999-10-23, interval 2 month)   1999-12-23
  f. last_day(2026-03-12)                   ---2026-03-31
  g. dayname(2026-03-18)                    --- wed
  h. addtime(2010-01-10 11:20:30, '1')------ 2010-01-10 11:20:31  / addtime(2010-01-10 11:20:30, '2:00:00')  add 2 hour
  

  ********session 5*********
  19. user()
  20. group and aggregate function
    a. sum(sal)  
    b. avg(sal)
    c. max(sal) 
    d. count(sal), count(*), 
    e. restriction wth group function 
      * can not select col of table alongwith group function --->(select ename, min(sal) from emp)
      * can not select single row function with group function -->(select upper(ename), min(sal) from emp)
      * can not use with where caluse---> (selec * from emp where sal>ag(sal))
  21. Group by clause
  select deptno, sum(sal) from emp group by deptno;  
  22. having clause
   select deptno, sum(sal) from emp group by deptno having sum(sal)>600;
   flow of exe
       - row retrivel
       - sorting
       - grouping 
       - summition
       - having
       - orderby


********* session 6*********
  23. joins
    a. equijoin
    b. inequijoin 
    c. full outer join
      select dname, ename from emp, dept where dept.deptno(+)=emp,deptno;  --->use in oracle
      select dname, ename from emp left join dept on (dept.deptn=emp,deptno);  --->use in mysql  
      union
      select dname, ename from emp, dept where dept.deptno=emp.deptno(+);  --->use in oracle
      select dname, ename from emp right outer join dept on (dept.deptn=emp,deptno);  --->use in mysql

    d. left outer join
      select dname, ename from emp, dept where dept.deptno(+)=emp,deptno;  --->use in oracle
      select dname, ename from emp left outer join dept on (dept.deptn=emp,deptno);  --->use in mysql  

    e. right outer join 
      select dname, ename from emp, dept where dept.deptno=emp.deptno(+);  --->use in oracle
      select dname, ename from emp right outer join dept on (dept.deptn=emp,deptno);  --->use in mysql
    f. inner join
    g. cross join (cartesian join)
         dept no      ename 
         1             a
         2             b 
         output : 
         1   a
         1   b
         2   a
         2   b
    h. self join
  24. joining of 3 and more table 
     1:1       (dhead--department)       
     1:many     
     many:1    
     many:many


     *************session 7**************
  25. Sub Queries
  26. Multi row sub queries
  27. co-related sub queries
  28. set operators 
    a.union 
    b.union all
    c.intersect
    d.except
  29. pseudocolumn 
    a.rowid
    b.limit

    *************session 8************** 
  30. indexes
  31. Ater table
    a. add column
       alter table emp add gst float;
    b. drop column
       alter tabele emp drop column gst;   
    c. modify column width(data truncate in case of reduce)
       alter table emp modify ename varchar(30);
    d. change datatype of column
       alter table emp modify empname char(20);
    e.copy row from one table to another
      insert into emp select * from emp2;
    f.copy a table
      create table emp as select * from emp2;
    g. copy only structure of table
      create table emp as select * from emp2;
      truncate table emp;   
  32. diff between delete and truncate




