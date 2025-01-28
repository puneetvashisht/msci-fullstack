import unittest
from add_numbers import add_numbers
# Test Case

class TestMathOperations(unittest.TestCase):
    
    def test_add_numbers(self):
        result = add_numbers(2, 3)
        self.assertEqual(result, 5)  # Check if the result is 5

if __name__ == '__main__':
    unittest.main()
