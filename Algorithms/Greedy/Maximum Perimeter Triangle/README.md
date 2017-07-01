Given  sticks of lengths , use  of the sticks to construct a non-degenerate triangle with the maximum possible perimeter. Then print the lengths of its sides as  space-separated integers in non-decreasing order.

If there are several valid triangles having the maximum perimeter:

Choose the one with the longest maximum side (i.e., the largest value for the longest side of any valid triangle having the maximum perimeter).
If more than one such triangle meets the first criterion, choose the one with the longest minimum side (i.e., the largest value for the shortest side of any valid triangle having the maximum perimeter).
If more than one such triangle meets the second criterion, print any one of the qualifying triangles.
If no non-degenerate triangle exists, print -1.

Input Format

The first line contains single integer, , denoting the number of sticks. 
The second line contains  space-separated integers, , describing the respective stick lengths.

Constraints

Output Format

Print  non-decreasing space-separated integers, , , and  (where ) describing the respective lengths of a triangle meeting the criteria in the above Problem Statement.

If no non-degenerate triangle can be constructed, print -1.

Sample Input 0

5
1 1 1 3 3
Sample Output 0

1 3 3
Sample Input 1

3
1 2 3
Sample Output 1

-1
Explanation

Sample Case 0: 
There are  possible unique triangles:

The second triangle has the largest perimeter, so we print its side lengths on a new line in non-decreasing order.

Sample Case 1: 
The triangle  is degenerate and thus can't be constructed, so we print -1 on a new line.
https://www.hackerrank.com/challenges/maximum-perimeter-triangle
