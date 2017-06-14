#Python 3.5.2
n = int(input())
i = 0
array = []
while(i<=n-1):
    array.append(int(input()))
    i = i+1


array.sort()
i=0
while(i<=n-1):
    print(array[i])
    i=i+1
