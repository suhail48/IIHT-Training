#Append element to list
x = lambda l, ele : l.append(ele)
l=[4,2,98,6,1,7]
e = int(input("Enter element to append to list: "))
x(l, e)
print("list: ",l)

#Convert list to dictionary
new_dict = { l[i]:l[i] for i in range(len(l))}
print("List converted to dictionary: ",new_dict)

#sort dictionary based on values
d=dict(sorted(new_dict.items(), key=lambda item: item[1]))
print("Sorted dictionary: ", d)
