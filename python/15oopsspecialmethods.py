class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Point({self.x}, {self.y})"

    def __repr__(self):
        return f"Point({self.x!r}, {self.y!r})"

    def __add__(self, other):
        if isinstance(other, Point):
            return Point(self.x + other.x, self.y + other.y)
        raise TypeError("Can only add two Point objects")

    def __eq__(self, other):
        if isinstance(other, Point):
            return self.x == other.x and self.y == other.y
        return False

# Usage
p1 = Point(2, 3)
p2 = Point(4, 5)
p3 = p1 + p2

print(p1)        # Output: Point(2, 3)
print(repr(p2))  # Output: Point(4, 5)
print(p3)        # Output: Point(6, 8)
print(p1 == p2)  # Output: False
