# Assignment : Calculate the last 3 transaction(mini statement) done on a debit card w.r.to the amount available, 
#               note he cannot withdraw more than the balance & available currency notes
#               e.g. if an atm has 100 * 2 , 200 * 3, 500 * 10 = 200 + 600 + 5000 = 5800 
#                   the total withdrawal amount cannot be more than than 90 % of the ATM cash e.g. as per above 90% of 5800 
#                   (i.e. 5220 round off 5200 since we dont have 20 rs notes)
# Assumptions : 
#                   1. Currency in the ATM is fixed 
#                   2. Balance for the Debit Card is predeclared
#                   3. No of transactions to be shown is fixed to last 3

l=[]
str_file=""
atm_balance = 10000
note_500=14
note_200=10
note_100=10
user_bal=8000

while True:
    answer=input("Would you like to withdraw, check balance, see last transactions or exit? ")
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
