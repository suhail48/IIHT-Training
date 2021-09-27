#Print Tower of Hanoi
step= int(input("Enter the step size:"))  
#step=2
rows = 5
s=1
l1=[]
sum_row=0
k = 2 * rows - 2
for i in range(1, rows+1):
    for j in range(0, k):
        print(end=" ")
    k = k - 1
    sum_row=0
    for j in range(0, i):
        print(s, end=" ")
        sum_row=sum_row+s
        s+=1
    s=s-i
    s=s+step
    l1.append(sum_row) 
    print("")
    
#print(l1)

#row-wise sum:
x=0
for i in range(len(l1)):
    print( "Sum of Row ",i+1 ,": ",l1[i])
    x=x+l1[i]
print("Sum of all rows: ", x)
    
  
# Still building the Matrix part of the assignment, will commit soon.
