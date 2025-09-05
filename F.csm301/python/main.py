def read_file(filepath):
    try:
        with open(filepath, "r", encoding="utf-8") as f:
            return f.read()
    except Exception as e:
        return "Error: " + str(e)

if __name__ == "__main__":
    path = "text.txt"
    content = read_file(path)
    print(content)
