n = int(input())
arr = input().split()
for i in range(0,len(arr)):
    arr[i] = int(arr[i])
count = 0
Max = max(arr)
for i in range(0,len(arr)):
    if(arr[i]==Max):
        count +=1
print(str(count))
