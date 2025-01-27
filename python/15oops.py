class Shape:
    def __init__(self, color):
        self._color = color  # Protected attribute

    def area(self):
        raise NotImplementedError("Subclass must implement abstract method")

    def get_color(self):
        return self._color

class Circle(Shape):
    def __init__(self, color, radius):
        super().__init__(color)  # Call parent constructor
        self.__radius = radius   # Private attribute

    def area(self):
        return 3.14 * self.__radius ** 2

class Rectangle(Shape):
    def __init__(self, color, width, height):
        super().__init__(color)
        self._width = width
        self._height = height

    def area(self):
        return self._width * self._height

# Usage
shapes = [
    Circle("Red", 5),
    Rectangle("Blue", 4, 6)
]

for shape in shapes:
    print(f"{shape.get_color()} shape with area: {shape.area()}")
