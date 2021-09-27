rows = int(input("Enter the number of rows:"))  
#rows = 5
k = 2 * rows - 2
for i in range(0, rows):
    for j in range(0, k):
        print(end=" ")
    k = k - 1
    for j in range(0, i + 1):
        print(i+1, end=" ")
    print("")
    
step= int(input("Enter the step size:"))  
rows = 5
s=1
k = 2 * rows - 2
for i in range(1, rows+1):
    for j in range(0, k):
        print(end=" ")
    k = k - 1
    for j in range(0, i):
        print(s, end=" ")
    s=s+step
        
    print("")
