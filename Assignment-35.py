#Append element to list
x = lambda l, ele : l.append(ele)
l=[]
n=int(input("Enter no. of elements to append "))
for i in range(n):
    e=int(input("Enter "))
    x(l,e)

print("list: ",l)


#Convert list to dictionary
new_dict = { l[i]:l[i] for i in range(len(l))}
print("List converted to dictionary: ",new_dict)

#sort dictionary based on values
d=dict(sorted(new_dict.items(), key=lambda item: item[1]))
print("Sorted dictionary: ", d)
