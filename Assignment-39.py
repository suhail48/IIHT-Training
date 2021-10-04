l=[]
str_file=""
atm_balance = 10000
note_500=14
note_200=10
note_100=10
user_bal=8000
PIN=1515

while True:
    answer=input("Would you like to withdraw, check balance, see last transactions or exit? ")
    pin=int(input("Enter PIN: "))
    c=0
    if pin!=PIN:
        print("Incorrect PIN, Enter PIN again")
        pin=int(input("Enter PIN: "))
        if pin!=PIN:
            print("Incorrect PIN, Account Blocked")
            break
        continue
    if answer== "withdraw" or answer== "Withdraw":
        y= int(input("How much would you like to withdraw? "))
        if y <= user_bal:
            print("Select Denomination for currency: 500Rs, 200Rs, 100Rs notes respectively")
            note_count_500=int(input("Enter count for 500Rs note "))
            note_count_200=int(input("Enter count for 200Rs note "))
            note_count_100=int(input("Enter count for 100Rs note "))
            demo_amt = note_count_500*500 + note_count_200*200 +note_count_100*100
            
            if demo_amt == y and note_500 >= note_count_500 and note_200 >= note_count_200 and note_100 >= note_count_100 and y<=((0.9)*atm_balance):
                note_500-=note_count_500
                note_200-=note_count_200
                note_100-=note_count_100
                user_bal -= y
                atm_balance -= y
                print ("Your new balance is: Rs" + str(user_bal))
                str_file="You withdrew an amount of Rs" + str(y) + "." + " " + "Current balance is Rs" + str(user_bal) + "\n"
                l.append(str_file)
                continue
            else:
                print("Wrong Denomination entered/ No required denomination available / Enter less balance")
                print("Available count for 500Rs note ", note_500)
                print("Available count for 200Rs note ", note_200)
                print("Available count for 100Rs note ", note_100)
                continue
        else:
            print ("Cannot be done. You have insufficient funds.")
    elif answer == "check balance" or answer== "Check Balance":
        print ("Rs " + str(user_bal))
    elif answer== "exit" or answer== "Exit":
        print ("Goodbye!")
        break
    elif answer == "last transactions":
        print("Latest transactions: \n")
        k=0
        if len(l)==0:
            break
        for i in range(len(l)-1,-1,-1):
            if k<=3:
                print(str(l[i]))
                k+=1
            else:
                break
    else:
        print ("I'm sorry, that is not an option")
        
# still doing part 3 of the problem
