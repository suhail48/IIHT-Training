lst=[['suhail', 'prakhat77@gg.com', 127],
['Aron', 'araon77@gg.com', 136],
['kashif', 'kk07@gg.com', 135],
['kashif', 'kk07@gg.com', 135]]







with open('listfile8.txt', 'w') as filehandle:
    filehandle.writelines("%s\n" % t for t in lst)

places = []


with open('listfile8.txt', 'r') as filehandle:
    for line in filehandle:
        
        currentPlace = line[:-1]

        
        places.append(currentPlace)
        

places = list( dict.fromkeys(places) )
t=places

with open('listfile9.txt', 'w') as filehandle:
    filehandle.writelines("%s\n" % t for t in places)
