num_tuple = (10, 20, 33, 46, 55, 58, 60, 70, 83)
print("Given list is ", num_tuple)
 
# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)