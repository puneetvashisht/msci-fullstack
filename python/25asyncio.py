import asyncio

# Define an asynchronous function (coroutine)
async def greet(name):
    print(f"Hello, {name}!")
    await asyncio.sleep(5)  # Simulates a non-blocking I/O operation
    print(f"Goodbye, {name}!")

# Define the main coroutine
async def main():
    # Run multiple coroutines concurrently
    # await asyncio.gather(
    #     greet("Alice"),
    #     greet("Bob"),
    #     greet("Charlie")
    # )
    await greet("Alice")
    print('Completed!')

# Run the event loop to execute the main coroutine
asyncio.run(main())



