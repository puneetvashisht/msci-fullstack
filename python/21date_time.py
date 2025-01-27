import datetime

# Get the current date and time
current_datetime = datetime.datetime.now()

# Format the date
formatted_date = current_datetime.strftime("%Y-%m-%d %H:%M:%S")

print(f"Current Date and Time: {formatted_date}")
