import asyncio
import aiohttp

async def fetch_url(url):
    async with aiohttp.ClientSession() as session:
        async with session.get(url) as response:
            print(f"Fetching {url}...")
            return await response.text()

async def main():
    # Simulate multiple asynchronous HTTP requests
    urls = [
        "https://example.com",
        "https://httpbin.org/get",
        "https://jsonplaceholder.typicode.com/posts"
    ]
    results = await asyncio.gather(*(fetch_url(url) for url in urls))
    
    # Print the lengths of the results to confirm they were fetched
    for url, result in zip(urls, results):
        print(f"Fetched {len(result)} characters from {url}")

# Run the asyncio event loop
asyncio.run(main())
