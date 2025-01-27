# # Define routes using frozensets
# Unique Routes: Using frozensets ensures that {"New York", "London"} and {"London", "New York"} are treated as the same key.
# Immutability: Frozensets prevent accidental modifications to the route keys.
# Dictionary Keys: Frozensets, being hashable, are valid dictionary keys, unlike regular sets.


routes = {
    frozenset(["New York", "London"]): {"flight_number": "NY101", "duration": "7h 30m"},
    frozenset(["Tokyo", "San Francisco"]): {"flight_number": "TS202", "duration": "10h 15m"},
    frozenset(["Paris", "Berlin"]): {"flight_number": "PB303", "duration": "1h 45m"},
}

# Querying for a route
query_route = frozenset(["London", "New York"])
if query_route in routes:
    print(f"Route details: {routes[query_route]}")
else:
    print("Route not found.")

# Adding a new route
routes[frozenset(["Sydney", "Melbourne"])] = {"flight_number": "SM404", "duration": "1h 25m"}

# Iterating through routes
print("\nAll routes:")
for route, details in routes.items():
    print(f"Route: {route}, Details: {details}")
