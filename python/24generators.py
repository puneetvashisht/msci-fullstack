# Generators are functions that yield values one at a time using the yield keyword instead of returning all values at once. They are memory-efficient and useful for handling large data streams or infinite sequences.

def log_generator(func):
    def wrapper(*args, **kwargs):
        print(f"Starting generator {func.__name__}")
        for value in func(*args, **kwargs):
            print(f"Yielding: {value}")
            yield value
        print(f"Generator {func.__name__} finished")
    return wrapper

@log_generator
def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        yield a
        a, b = b, a + b

# Usage
for num in fibonacci(5):
    print(f"Received: {num}")


# Iterable: Contains data that can be iterated over (e.g., lists, strings). It returns an iterator when iter() is called.
# Iterator: Generates values one at a time using next() and raises StopIteration when done.