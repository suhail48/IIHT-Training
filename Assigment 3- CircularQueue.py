class CircularQueue():

    def __init__(self, maxSize):
        self.maxSize = maxSize
        self.queue = [None] * maxSize
        self.front = self.rear = -1

    def enqueue(self, data):

        if ((self.rear + 1) % self.maxSize == self.front):
            print("circular queue is full\n")

        elif (self.front == -1):
            self.front = 0
            self.rear = 0
            self.queue[self.rear] = data
        else:
            self.rear = (self.rear + 1) % self.maxSize
            self.queue[self.rear] = data

    def dequeue(self):
        if (self.front == -1):
            print("circular queue is empty\n")

        elif (self.front == self.rear):
            temp = self.queue[self.front]
            self.front = -1
            self.rear = -1
            return temp
        else:
            temp = self.queue[self.front]
            self.front = (self.front + 1) % self.maxSize
            return temp

    def printCircularQueue(self):
        if(self.front == -1):
            print("circular queue is empty")

        elif (self.rear >= self.front):
            for i in range(self.front, self.rear + 1):
                print(self.queue[i], end=" ")
            print()
        else:
            for i in range(self.front, self.maxSize):
                print(self.queue[i], end=" ")
            for i in range(0, self.rear + 1):
                print(self.queue[i], end=" ")
            print()

obj = CircularQueue(5)
obj.printCircularQueue()
obj.enqueue(1)
obj.enqueue(2)
obj.enqueue(3)
obj.enqueue(4)
obj.enqueue(5)
print("Initial queue")
obj.printCircularQueue()
obj.dequeue()
print("After removing an element from the queue")
obj.printCircularQueue()
obj.dequeue()
obj.dequeue()
obj.printCircularQueue()
obj.enqueue(6)
obj.printCircularQueue()
