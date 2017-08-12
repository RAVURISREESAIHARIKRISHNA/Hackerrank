select concat(name,concat('(',concat(substr(occupation,1,1),')'))) from occupations order by name;
select concat('There are a total of ',concat(count(occupation),concat(' ',concat(lower(occupation),'s.')))) from occupations group
by occupation order by count(occupation),occupation;
