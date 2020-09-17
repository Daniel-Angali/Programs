#Execution
#BubbleSort.py
#Enter elements to sort: 8 4 1 2 3
#Elements after sorting:  [1, 2, 3, 4, 8]

a= [int(x) for x in input("Enter elements to sort: ").split()]
n=len(a)
for i in range(0,n-1):
    for j in range(0,n-i-1):
        if a[j]>a[j+1]:
            a[j],a[j+1] = a[j+1],a[j]
print("Elements after sorting: ",a)
