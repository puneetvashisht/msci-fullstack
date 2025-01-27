# from functools import partial

# def multiply(x, y):
#         return x * y

# # create a new function that multiplies by 2
# dbl = partial(multiply, 2)
# print(dbl(4))

from functools import partial

def multiply(x, y):
    return x * y

# Create a partial function with x=5
multiply_by_5 = partial(multiply, 5)

# Now multiply_by_5 only needs the second argument
result1 = multiply_by_5(10)
result2 = multiply_by_5(3)

print(f"5 * 10 = {result1}")  # Output: 50
print(f"5 * 3 = {result2}")    # Output: 15
