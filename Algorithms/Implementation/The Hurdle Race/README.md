heights . He can initially jump a maximum height of  units, but he has an unlimited supply of magic beverages that help him jump higher! Each time Dan drinks a magic beverage, the maximum height he can jump during the race increases by  unit.

Given , , and the heights of all the hurdles, find and print the minimum number of magic beverages Dan must drink to complete the race.

Input Format

The first line contains two space-separated integers describing the respective values of  (the number of hurdles) and  (the maximum height he can jump without consuming any beverages). 
The second line contains  space-separated integers describing the respective values of .

Constraints

Output Format

Print an integer denoting the minimum number of magic beverages Dan must drink to complete the hurdle race.

Sample Input 0

5 4
1 6 3 5 2
Sample Output 0

2
Explanation 0

Dan's character can jump a maximum of  units, but the tallest hurdle has a height of :

image

To be able to jump all the hurdles, Dan must drink  magic beverages.

Sample Input 1

5 7
2 5 4 5 2
Sample Output 1

0
Explanation 1

Dan's character can jump a maximum of  units, which is enough to cross all the hurdles:

image

Because he can already jump all the hurdles, Dan needs to drink  magic beverages.
https://www.hackerrank.com/challenges/the-hurdle-race
