# a = set(["Jake", "John", "Eric"])
# b = set(["John", "Jill"])

# print(a.intersection(b))
# print(b.intersection(a))


# print(a.difference(b))
# print(b.difference(a))


# print(a.union(b))

# Creating a set
fruits = {"apple", "banana", "cherry"}
print(f"Fruits set: {fruits}")

# Adding an element
fruits.add("orange")
print(f"After adding 'orange': {fruits}")

# Removing an element
fruits.remove("banana")
print(f"After removing 'banana': {fruits}")

# Check if an element exists
print("Is 'apple' in the set?", 'apple' in fruits)

# Set union (combining elements from two sets)
tropical = {"pineapple", "mango"}
combined = fruits.union(tropical)
print(f"Combined set (union): {combined}")

# Set intersection (common elements)
another_set = {"cherry", "apple", "grapes"}
intersection = fruits.intersection(another_set)
print(f"Intersection of sets: {intersection}")
