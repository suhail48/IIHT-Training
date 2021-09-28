
# Sorting Numerical/Alphabetical Data:
def mergeSort(myList):
    if len(myList) > 1:
        mid = len(myList) // 2
        left = myList[:mid]
        right = myList[mid:]

        # Recursive call on each half
        mergeSort(left)
        mergeSort(right)

        # Two iterators for traversing the two halves
        i = 0
        j = 0
        
        # Iterator for the main list
        k = 0
        
        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
              # The value from the left half has been used
              myList[k] = left[i]
              # Move the iterator forward
              i += 1
            else:
                myList[k] = right[j]
                j += 1
            # Move to the next slot
            k += 1

        # For all the remaining values
        while i < len(left):
            myList[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            myList[k]=right[j]
            j += 1
            k += 1





#List
List = [54,26,93,17,77,31,44,55,20]
mergeSort(List)
print("New sorted List: ",List)

List = ['apsd', 'bchd', 'bd']
mergeSort(List)
print("New sorted List: ",List)


#Set
Set={7,2,7,1,9,4,6,8}
mergeSort(list(Set))
print("New sorted Set: ",Set)

#Tuple
Tuple = (1, 5, 7, 9, 3)
mergeSort(list(Tuple))
print("New sorted Tuple: ",Tuple)

#Dictionary
dict1={5:'apple', 2:'ball', 4: 'orange', 8: 'cat', 1: 'cricket'}
l=list(dict1.keys())
new_dict={}
mergeSort(l)
for i in range(len(l)):
    #print(l[i], dict1[l[i]])
    new_dict[l[i]]=dict1[l[i]]
print("New sorted Dictionary: ",new_dict)

