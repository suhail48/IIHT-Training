class Queue:

    def __init__(self):
        self.queue = []

    # Add an element
    def enqueue(self, item):
        self.queue.append(item)

    # Remove an element
    def dequeue(self):
        if len(self.queue) < 1:
            return None
        return self.queue.pop(0)

    # Display  the queue
    def display(self):
        print(self.queue)

    def size(self):
        return len(self.queue)
 def convert(arr):
    min2=9999999
    min1=min(arr)
    l1=[]
    l2=[]
    for e in arr:
        if e<min2 and e!=min1:
            min2=e
    for e in arr:
        if e%min1==0 and e!=min1:
            l1.append(e)
        if e%min2==0 and 2!=min2:
            l2.append(e)
    l=[]
    for e in l2:
        l.append(e)
    for e in l1:
        l.append(e)
    q=Queue()
    for e in l:
        q.enqueue(e)
    #q.display()
    #print(type(q))
    return q
new_queue=convert([17,15,9,12,6,3,2]) #stack array passed as a list in 'convert' function.
print(new_queue.size()) #size of queue i.e 7.
print(new_queue.display()) #elements in the queue i.e [15, 9, 12, 6, 3, 12, 6].
