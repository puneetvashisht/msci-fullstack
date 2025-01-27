

# def outer_function(msg):
#     def inner_function():
#         msg = "World!"
#         print(msg)
#     return inner_function


# outer_function [x= 0, innerFunction= fn]
# inner_function [x]
def outer_function():
    x = 0;
    def inner_function():
        print(x)
        print("World!")
        x = 3;
    return inner_function

# Create closure with 'Hello!' as the message
# result = outer_function()
# result()
outer_function()()

# Call the closure
# hello_closure()  # Output: Hello!

# hello_closure()



# # HOC
# def multiplier(factor):
#     def multiply_by(value):
#         return value * factor
#     return multiply_by

# # Usage
# double = multiplier(2)
# triple = multiplier(3)

# print(double(5))  # Output: 10
# print(triple(5))  # Output: 15

