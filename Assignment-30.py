Set={7,2,7,1,9,4,6,8}
NumList=list(s)
n=len(NumList)
#sort
for i in range (n):
    for j in range(i + 1, n):
        if(NumList[i] < NumList[j]):
            temp = NumList[i]
            NumList[i] = NumList[j]
            NumList[j] = temp

print("Element After Sorting List in Descending Order is : ", NumList)
