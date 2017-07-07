def Round(n):
    if(n<38):
        return n
    if(( (int(n/5)+1)*5 -n)<3):
        return (int(n/5)+1)*5
    else:
        return n

n = int(input())
a = []
for i in range(0,n):
    x = int(input())
    a.append(Round(x))
for i in range(0,len(a)):
    print(a[i])
