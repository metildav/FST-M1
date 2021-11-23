numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
len = len(numbers)
if (numbers[0] == numbers[len-1]):
    print("True")
else:
    print("False")

"""

print("Given list is ", numbers)
# Get first element in list
firstElement = numbers[0]
# Get last element in list
lastElement = numbers[-1]
 
# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)

"""
