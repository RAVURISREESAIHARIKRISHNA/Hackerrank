a = int(input())
b = int(input())
count = 0
for i in range(a,b+1):
    j = i**2
    raw = str(j)
    d = len(raw)
    right= raw[int(d/2):]
    left = raw[0:int(d/2)]
    if(left !=''):
        left = int(left)
    else:
        left = 0
    if(right != ''):
        right = int(right)
    else:
        right = 0
    if(left+right == i):
        count = 1
        print(i,end='')
        print(' ',end='')
    if(i == b and count ==0):
        print('INVALID RANGE')
