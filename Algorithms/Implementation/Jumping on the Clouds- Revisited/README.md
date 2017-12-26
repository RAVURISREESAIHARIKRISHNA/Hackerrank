Aerith is playing a cloud game! In this game, there are  clouds numbered sequentially from  to . Each cloud is either an ordinary cloud or a thundercloud.

Aerith starts out on cloud  with energy level . She can use  unit of energy to make a jump of size  to cloud , and she jumps until she gets back to cloud . If Aerith lands on a thundercloud, her energy () decreases by  additional units. The game ends when Aerith lands back on cloud .

Given the values of , , and the configuration of the clouds, can you determine the final value of  after the game ends?

Note: Recall that  refers to the modulo operation.

Input Format

The first line contains two space-separated integers,  (the number of clouds) and  (the jump distance), respectively. 
The second line contains  space-separated integers describing the respective values of clouds . Each cloud is described as follows:

If , then cloud  is an ordinary cloud.
If , then cloud  is a thundercloud.
Constraints

Output Format

Print the final value of  on a new line.

Sample Input

8 2
0 0 1 0 0 1 1 0
Sample Output

92
Explanation

In the diagram below, red clouds are thunderclouds and purple clouds are ordinary clouds:

game board

Observe that our thunderclouds are the clouds numbered , , and . Aerith makes the following sequence of moves:

Move: , Energy: .
Move: , Energy: .
Move: , Energy: .
Move: , Energy: .
Thus, we print  as our answer.


https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
