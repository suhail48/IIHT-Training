class_dict = {
  "Alex": [ 40, 70, 90],
  "Samuel": [ 70, 80, 90],
  "Natasha": [ 30, 40, 90]
}
failing_students=[]
reappearing_students=[]
passed_students=[]
firstDivision=[]
secondDivision=[]
distinction=[]
for student, marks in class_dict.items():
    sum=0
    count=0
    for m in marks:
        if m<=50:
            count+=1
        sum=sum+m
    if count>=2:
        failing_students.append(student)
    elif count==1:
        reappearing_students.append(student)
    else :
        passed_students.append(student)
    
    if sum/3 >= 80:
        distinction.append(student)
    elif sum/3 >=60 and sum/3 < 80:
        firstDivision.append(student)
    elif sum/3 >= 50 and sum/3 < 60:
        secondDivision.append(student)
        
print("List of Students passed: ", (passed_students))
print("List of Students Reappearing for exam: ",reappearing_students)
print("List of Failed Students: ",failing_students)
print()

print("List of Students passed with Distinction: ",distinction)
print("List of Students passed with First Division: ",firstDivision)
print("List of Students passed with Second Division: ",secondDivision)
print()
pass_perc=len(passed_students)*100/(len(passed_students)+len(failing_students)+len(reappearing_students))
print("Passed Student % = ", (pass_perc))
