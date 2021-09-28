l1=[2,4,8,10]
step_cal=[]

for i in range(1,len(l1)):
    step=l1[i]-l1[i-1]
    step_cal.append(step)

def mostFrequent(arr, n):
	arr.sort()
	max_count = 1; res = arr[0]; curr_count = 1
	for i in range(1, n):
		if (arr[i] == arr[i - 1]):
			curr_count += 1
		else :
			if (curr_count > max_count):
				max_count = curr_count
				res = arr[i - 1]
			
			curr_count = 1

	if (curr_count > max_count):
	
		max_count = curr_count
		res = arr[n - 1]
	
	return res

# Driver Code

n = len(step_cal)
step = mostFrequent(step_cal, n)
#print(step)

missing_ele=[]
k=0
for i in range(l1[0],l1[-1],step):
    if (i != l1[k]):
        l1.insert(k,i)
        missing_ele.append(i)
        k+=1
        break
    k+=1

print(" Missing element in the list: ", missing_ele)
print(" Updated list: ", l1)
