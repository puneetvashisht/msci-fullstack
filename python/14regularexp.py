import re

def regex_examples():

    # 1. Basic pattern matching using re.search()
    print("--- Example 1: Basic Pattern Matching ---")
    text1 = "The quick brown fox jumps over the lazy dog."
    pattern1 = r'fox'
    match1 = re.search(pattern1, text1)
    if match1:
        print(f"Pattern '{pattern1}' found:", match1.group())
    else:
        print(f"Pattern '{pattern1}' not found.")

    # 2. Finding all matches using re.findall()
    print("--- Example 2: Finding All Matches ---")
    text2 = "There are 3 cats and 5 dogs."
    pattern2 = r'\d+'  # Match all digits
    matches2 = re.findall(pattern2, text2)
    print("All digits found:", matches2)

    # 3. Replacing text using re.sub()
    print("--- Example 3: Replacing Text ---")
    text3 = "My number is 123-456-7890."
    pattern3 = r'\d'  # Match digits
    replaced_text = re.sub(pattern3, '#', text3)
    print("Text after replacement:", replaced_text)

    # 4. Using groups to extract information
    print("--- Example 4: Using Groups ---")
    text4 = "My birthday is on 12/09/2024."
    pattern4 = r'(\d{2})/(\d{2})/(\d{4})'  # Grouping for day, month, year
    match4 = re.search(pattern4, text4)
    if match4:
        day, month, year = match4.groups()
        print(f"Extracted date - Day: {day}, Month: {month}, Year: {year}")

    # 5. Using re.match() vs re.search()
    print("--- Example 5: re.match() vs re.search() ---")
    text5 = "The cat is on the roof."
    pattern5 = r'cat'
    match5 = re.match(pattern5, text5)
    search5 = re.search(pattern5, text5)
    print(f"re.match() result: {match5}")  # Should be None
    print(f"re.search() result: {search5.group()}")  # Should find 'cat'

    # 6. Using re.split() to split a string
    print("--- Example 6: Splitting Strings ---")
    text6 = "apple, banana; cherry|grape"
    pattern6 = r'[;,|]'  # Match commas, semicolons, or pipes
    fruits = re.split(pattern6, text6)
    print("Fruits list after split:", fruits)

    # 7. Using flags for case-insensitive matching
    print("--- Example 7: Case-Insensitive Matching ---")
    text7 = "Python is Fun!"
    pattern7 = r'python'
    match7 = re.search(pattern7, text7, re.IGNORECASE)
    if match7:
        print("Case-insensitive match found:", match7.group())

    # 8. Extracting emails from a string
    print("--- Example 8: Extracting Emails ---")
    text8 = "Contact us at support@example.com and sales@example.com."
    pattern8 = r'\b[\w.-]+@[\w.-]+\.\w{2,}\b'
    emails = re.findall(pattern8, text8)
    print("Emails found:", emails)

    # 9. Matching at the start and end of a string
    print("--- Example 9: Matching Start and End of String ---")
    text9 = "Start and finish."
    start_pattern = r'^Start'
    end_pattern = r'finish\.$'
    start_match = re.match(start_pattern, text9)
    end_match = re.search(end_pattern, text9)
    print(f"Starts with 'Start': {bool(start_match)}")
    print(f"Ends with 'finish.': {bool(end_match)}")

    # 10. Matching any character with .
    print("--- Example 10: Matching Any Character ---")
    text10 = "abc123def"
    pattern10 = r'abc.23'  # . matches any character
    match10 = re.search(pattern10, text10)
    if match10:
        print(f"Pattern '{pattern10}' found:", match10.group())
    
    # 11. Quantifiers in regex
    print("--- Example 11: Using Quantifiers ---")
    text11 = "I have 111 apples, 22 bananas, and 333 oranges."
    pattern11 = r'\d{2,}'  # Match two or more digits
    matches11 = re.findall(pattern11, text11)
    print("Quantifier matches:", matches11)

# Run all the examples
regex_examples()


# Basic Pattern Matching (re.search): Finds the first occurrence of the pattern "fox".
# Finding All Matches (re.findall): Finds all sequences of digits.
# Replacing Text (re.sub): Replaces all digits in the phone number with #.
# Using Groups (re.search): Extracts day, month, and year from a date string.
# re.match vs re.search: Shows the difference between matching from the start and searching the entire string.
# Splitting Strings (re.split): Splits the text at commas, semicolons, or pipes.
# Case-Insensitive Matching (re.IGNORECASE): Finds a pattern, ignoring case.
# Extracting Emails: Finds all email addresses in a string.
# Matching Start/End of a String (^ and $): Checks if the string starts and ends with specific patterns.
# Matching Any Character (.): Shows how to match any single character.
# Using Quantifiers ({n,}): Finds sequences of two or more digits.
