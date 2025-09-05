import unittest
from main import read_file

class TestReadFile(unittest.TestCase):

    def test_existing_file(self):
        path = "text.txt"
        result = read_file(path)
        self.assertFalse(result.startswith("Error"))
        self.assertTrue(len(result) > 0)

    def test_non_existing_file(self):
        path = "not_exist.txt"
        result = read_file(path)
        self.assertTrue(result.startswith("Error"))

if __name__ == "__main__":
    unittest.main()
