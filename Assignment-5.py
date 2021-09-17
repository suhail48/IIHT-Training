class Queue:

    def __init__(self):
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if len(self.queue) < 1:
            return None
        return self.queue.pop(0)

    def display(self):
        print(self.queue)

    def size(self):
        return len(self.queue)
   
   class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def print_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next

    def append(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return

        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node

    def prepend(self, data):
        new_node = Node(data)

        new_node.next = self.head
        self.head = new_node
    def delete_node(self, key):

        cur_node = self.head

        if cur_node and cur_node.data == key:
            self.head = cur_node.next
            cur_node = None
            return

        prev = None 
        while cur_node and cur_node.data != key:
            prev = cur_node
            cur_node = cur_node.next

        if cur_node is None:
            return 

        prev.next = cur_node.next
        cur_node = None

    def sort_linked_list(self):   
        current = self.head;  
        index = None;  
          
        if(self.head == None):  
            return;  
        else:  
            while(current != None):  
                index = current.next;  
                  
                while(index != None):  
                    if(current.data > index.data):  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    index = index.next;  
                current = current.next;

    def convert_to_queue(self):
        cur_node = self.head
        l=[]
        while cur_node:
            l.append(cur_node.data)
            cur_node = cur_node.next
        q=ret_queue(l)
        return q

def ret_queue(l):
        q=Queue()
        for element in l:
            q.enqueue(element)
        return q

llist = LinkedList()
llist.append(5)
llist.append(45)
llist.append(23)
llist.append(11)
#llist.print_list()

llist.sort_linked_list()
#llist.print_list()
queue=llist.convert_to_queue()
queue.display()
