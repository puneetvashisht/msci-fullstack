# lamda function
greet = lambda name: f"Hello, {name}!"

# Test the lambda function

print(greet("Alice"))  # Expected output: Hello, Alice!
print(greet("Bob"))   # Expected output: Hello, Bob!

# functions with variable number of arguments

def add_numbers(x, y, *args):
    return sum(args)

result = add_numbers(1, 2, 3, 4)
print(result)

def loan_calc(age: int):
    return 5000 * age

result = loan_calc("25")
print(result)


def multiply_numbers(*args):
    result = 1

#functions with keyword arguments

def greet_with_age(name, age):
    return f"Hello, {name}! You are {age} years old."

#lamda function for greet_with_age

greet_with_age_lambda = lambda name, age: f"Hello, {name}! You are {age} years old."