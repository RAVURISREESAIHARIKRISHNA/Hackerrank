#Python 2.7.12
#!/usr/bin/python
def quicksort2(arr):
    # base case
    if len(arr) < 2:
        return arr
    
    pivot = arr[0]
    left = []
    right = []
    
    for i in range(1, len(arr)):
        if arr[i] > pivot:
            right.append(arr[i])
        elif arr[i] <= pivot:
            left.append(arr[i])
    # recursion starts here
    if len(left) > 1:
        left = quicksort2(left)
        print ' '.join(map(str,left))
    if len(right) > 1:
        right = quicksort2(right)
        print ' '.join(map(str,right))
    return left + [pivot] + right 
    
    
m = raw_input()
arr = [int(i) for i in raw_input().strip().split()]
print ' '.join(map(str,quicksort2(arr)))
