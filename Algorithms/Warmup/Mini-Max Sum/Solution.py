arr = input().split()
for i in range(0,len(arr)):
    arr[i] = int(arr[i])
print("%d %d"%(sum(arr)-max(arr) , sum(arr)-min(arr)))
