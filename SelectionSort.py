#Execution
#SelectionSort.py
#Enter elements to sort: 8 7 5 1 4
#Elements after sorting:  [1, 4, 5, 7, 8]
a = [int(x) for x in input("Enter elements to sort: ").split()]
n = len(a)
for i in range(n-1):
    min = a[i]
    loc = i
    for j in range(i+1,n):
        if min>a[j]:
            min = a[j]
            loc = j
    a[i],a[loc] = a[loc],a[i]
print("Elements after sorting: ",a)
