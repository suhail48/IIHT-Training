def firstOccurrence(array,element):
    if len(array)==0:
        return "Element not Found"
    for i in range(len(array)):
        if array[i]==element:
            return i
    return "Element not found"

def allOccurrence(array, element):
    if len(array)==0:
        return "Element not Found"
    l=[]
    for i in range(len(array)):
        if array[i]==element:
            l.append(i)
    if len(l)==0:
        return "Element not Found"
    else:
        return l

data = [11,7,7,3,9]

print(firstOccurrence(data,7))
print(allOccurrence(data,7))
