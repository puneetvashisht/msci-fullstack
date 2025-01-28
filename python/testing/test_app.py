import unittest
from unittest.mock import patch
from app import get_data

class TestGetData(unittest.TestCase):

    @patch('app.requests.get')  # Mock `requests.get`
    def test_get_data_success(self, mock_get):
        # Mock the response object and its attributes
        mock_get.return_value.status_code = 200
        mock_get.return_value.json.return_value = {"key": "value"}

        # Call the function
        result = get_data("https://fakeapi.com/data")

        # Assertions
        mock_get.assert_called_once_with("https://fakeapi.com/data")
        self.assertEqual(result, {"key": "value"})

    @patch('app.requests.get')
    def test_get_data_failure(self, mock_get):
        # Mock a failure response
        mock_get.return_value.status_code = 404

        # Call the function
        result = get_data("https://fakeapi.com/data")

        # Assertions
        mock_get.assert_called_once_with("https://fakeapi.com/data")
        self.assertIsNone(result)

if __name__ == "__main__":
    unittest.main()
