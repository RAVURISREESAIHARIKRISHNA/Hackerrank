Consider an array of integers, . We define the absolute difference between two elements, and  (where ), to be the absolute value of .

Given an array of  integers, find and print the minimum absolute difference between any two elements in the array.

Input Format

The first line contains a single integer denoting  (the number of integers). 
The second line contains  space-separated integers describing the respective values of .

Constraints

Output Format

Print the minimum absolute difference between any two elements in the array.

Sample Input 0

3
3 -7 0
Sample Output 0

3
Explanation 0

With  integers in our array, we have three possible pairs: , , and . The absolute values of the differences between these pairs are as follows:

Notice that if we were to switch the order of the numbers in these pairs, the resulting absolute values would still be the same. The smallest of these possible absolute differences is , so we print  as our answer.
https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
