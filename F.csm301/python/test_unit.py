import unittest
import sys
from main import read_file  

class TestFileRead(unittest.TestCase):
    def test_dynamic_file(self):
        if len(sys.argv) > 1:
            path = sys.argv[1]  


if __name__ == "__main__":
    unittest.main(argv=['first-arg-is-ignored'], exit=False)
