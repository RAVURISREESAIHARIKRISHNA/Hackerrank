a = 0
b = 0
arr = input().split()
brr = input().split()
for i in range(0,3):
    if(int(arr[i]) > int(brr[i])):
        a += 1
        #print(arr[i] , int(brr[i]))
    elif(int(brr[i]) > int(arr[i])):
        b += 1
print(str(a)+" "+str(b))
