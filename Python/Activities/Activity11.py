fruit_prices = {
    "apple": 100,
    "banana": 190,
    "orange": 80,
    "peaches": 140
}

validate = input("What are you looking for? ").lower()

if(validate in fruit_prices):
    print("Yes, this is available")
else:
    print("No, this is not available")