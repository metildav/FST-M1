listOne = [26, 13, 7, 9, 10, 2]
listTwo = [1, 5, 8, 3, 12, 16, 14]

print ("First List: ", listOne)
print ("Second List: ", listTwo)

thirdList = []
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)

for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)
print ("Third List is: ", thirdList)