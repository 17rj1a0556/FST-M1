
lst=[]
num=int(input('how many numbers to enter in list'))
for n in range(num):
    numbers = int(input("enter numbers"))
    lst.append(numbers)

print("Given list is ", lst)


firstElement = lst[0]

lastElement = lst[-1]


if (firstElement == lastElement):
    print(True)
else:
    print(False)