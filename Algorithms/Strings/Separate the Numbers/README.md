A numeric string, , is beautiful if it can be split into a sequence of two or more positive integers, , satisfying the following conditions:

 for any  (i.e., each element in the sequence is  more than the previous element).
No  contains a leading zero. For example, we can split  into the sequence , but it is not beautiful because  and  have leading zeroes.
The contents of the sequence cannot be rearranged. For example, we can split  into the sequence , but it is not beautiful because it breaks our first constraint (i.e., ).
The diagram below depicts some beautiful strings:

image

You must perform  queries, where each query consists of some string . For each query, print whether or not the string is beautiful on a new line. If it's beautiful, print YES x, where  is the first number of the increasing sequence (if there are multiple such values of , choose the smallest); otherwise, print NO instead.

Input Format

The first line contains an integer denoting  (the number of strings to evaluate). 
Each of the  subsequent lines contains some string  for a query.

Constraints

Each character in  is a decimal digit from  to  (inclusive).
Output Format

For each query, print its answer on a new line (i.e., either YES x where  is the smallest first number of the increasing sequence, or NO).

Sample Input 0

7
1234
91011
99100
101103
010203
13
1
Sample Output 0

YES 1
YES 9
YES 99
NO
NO
NO
NO
Explanation 0

The first three numbers are beautiful (see the diagram above). The remaining numbers are not beautiful:

For , all possible splits violate the first and/or second conditions.
For , it starts with a zero so all possible splits violate the second condition.
For , the only possible split is , which violates the first condition.
For , there are no

https://www.hackerrank.com/challenges/separate-the-numbers/problem
