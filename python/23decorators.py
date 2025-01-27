def decorator(func):
    def wrapper():
        print("Before function call")
        func()
        print("After function call")
    return wrapper

@decorator
def say_hello():
    print("Hello, World!")

# Usage
say_hello()


# Built-in Decorators
# @staticmethod
# @classmethod
# @property

# Logging: Automatically log function calls and their outputs.
# Access Control: Restrict access based on conditions (e.g., user authentication).
# Caching: Save results of expensive computations for reuse.
# Timing: Measure execution time of functions.