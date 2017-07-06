#arr = [][]
n = int(input())
arr = [[0]*n for i in range(0,n)]
for i in range(0,n):
    arr[i] = input().split()
sum_0 = sum_1 = 0

for i in range(0,n):
    sum_0 += int(arr[i][i])
    sum_1 += int(arr[i][n-i-1])    
print(str(abs(sum_0-sum_1)))
