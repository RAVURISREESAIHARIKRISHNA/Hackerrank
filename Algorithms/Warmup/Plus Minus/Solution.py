n = int(input())
arr = input().split()
pos = neg = ze = 0
for i in range(0,n):
    if(int(arr[i])>0):
        pos += 1
        continue
    if(int(arr[i])<0):
        neg += 1
        continue
    ze += 1
print("%.6f\n%.6f\n%.6f"%(pos/n , neg/n , ze/n))
