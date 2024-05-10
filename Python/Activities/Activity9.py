lst1=[]
num=int(input('how many numbers to enter in list 1'))
for n in range(num):
    numbers = int(input("enter numbers"))
    lst1.append(numbers)

lst2=[]
num=int(input('how many numbers to enter in list 2'))
for n in range(num):
    numbers = int(input("enter numbers"))
    lst2.append(numbers)

print("First List ", lst1)
print("Second List ", lst2)


thirdList = []


for num in lst1:
    if (num % 2 != 0):
        thirdList.append(num)
        

for num in lst2:
    if (num % 2 == 0):
        thirdList.append(num)

print("result List is:")
print(thirdList)