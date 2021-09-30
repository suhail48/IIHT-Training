class Project:
    def f1(self,id,name):
        self.id=id
        self.name=name
        #self.User=User
        return id,name #,User;

class lstUser:
    def f2(self,id,name,salary,project_id):
       self.id=id
       self.name=name
       self.salary=salary
       self.project_id=project_id
       return id, name, salary,project_id;

project = []
obj2 = Project()
n1 = int(input("Enter No. of Projects"))
for i in range(n1):
        x1 = int(input("Enter the project id "))
        x2 = input("Enter the project name ")
        obj2.f1(x1, x2)
        project.append([x1,x2])

print(project)

print("\n")
User = []
obj1 = lstUser()
n1 = int(input("Enter No. of Employees"))
for i in range(n1):
    x1 = input("Enter the Employee's name ")
    x2 = int(input("Enter the Employee's id "))
    x3 = int(input("Enter the Employee's salary "))
    x4 = int(input("Enter Project ID "))
    obj1.f2(x2, x1, x3, x4)
    User.append([x2,x1,x3,x4])

print(User)

#PROJECT IDs
project_id=[]
for i in range(len(project)):
    project_id.append(project[i][0])
print(project_id)

User.sort(key=lambda x:x[-1])
d={}
for p in project_id:
    l1=[]
    for i in range(len(User)):
        if str(User[i][3]) == str(p):
            l1.append(User[i])
    d[int(p)] = l1

#Employees based on Project
print("Employees based on project IDs")
for key,value in d.items():
    print('Project ID: ',key, ' & Employee ID,name,Salary,Project repectively: ', value)


#Employees based on salary (DESCENDING ORDER):
User.sort(key=lambda x:x[2],reverse = True)
for i in range(len(User)):
    print("Employee Name: ",User[i][1], ", Project ID: ",User[i][-1],", and Salary: ",User[i][2])

#Dictionary with key=Project ID and Value=User's data
print(d)
