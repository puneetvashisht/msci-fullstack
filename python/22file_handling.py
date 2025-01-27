# File handling: Writing to a file
with open("sample.txt", "w") as file:
    file.write("Hello, Python File Handling!")

# Reading from a file
with open("sample.txt", "r") as file:
    content = file.read()
    print(f"File Content: {content}")

# Output formatting
number = 42.123456
formatted_number = "{:.2f}".format(number)
print(f"Formatted Number: {formatted_number}")
