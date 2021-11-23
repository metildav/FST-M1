fruit_Dict = {
    "apple": 20,
    "banana": 15,
    "guava": 12,
    "papaya": 25
}

fruit_Availability = input ("Which fruit you are looking for? ").lower()

if (fruit_Availability in fruit_Dict):
    print (fruit_Availability + " is available")
else:
    print(fruit_Availability + " is not available")