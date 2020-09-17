#Execution
#InsertionSort.py
#Enter elements to sort: 8 1 2 4 7
#Elements after sorting:  [1, 2, 4, 7, 8]
a = [int(x) for x in input('Enter elements to sort: ').split()]
n = len(a)
for j in range(1,n):
    i = j-1
    key = a[j]
    while i >= 0 and a[i] > key:
        a[i+1] = a[i]
        i=i-1
    a[i+1],key = key, a[i+1]
print('Elements after sorting: ',a)

