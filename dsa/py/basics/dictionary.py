"""
https://realpython.com/python-dicts/
keys - Unique, Immuatable (can use tuple as key)
values - no restrictions for dictionary values
"""

a = dict()

for i in range(10):
    a[i] = chr(65 + i)
print(a)

a[4] = "X"  # update dict
print(a)


places = ["Colorado", "Chicago", "Boston", "Minnesota", "Milwaukee", "Seattle"]
teams = ["Rockies", "White Sox", "Red Sox", "Twins", "Brewers", "Mariners"]
print(dict(zip(places, teams)))

print(dir(a))

# comprehensions
squares = {integer: integer**2 for integer in range(1, 10)}
print(squares)

inventory = dict.fromkeys(["apple", "orange", "banana", "mango"], 0)
print(inventory)

print(inventory.get("apple"))
print(inventory.get("grape"))

print(inventory.keys())
print(inventory.values())
print(inventory.items())

inventory.update(a)  # merge two dict
print(inventory)


# remove data from dict
print(inventory.pop("apple"))
print(inventory.pop("grape", -1))

print(inventory.popitem())  # LIFO

inventory.clear()
print(inventory)

print("---")

a = {"a": 1, "b": 2, "c": 3, "d": 4}
b = {"c": 3, "d": 4, "e": 5, "f": 6}

# common keys
print(a.keys() & b.keys())  # & -> intersection operation on set-like objects

# common values
print(set(a.values()) & set(b.values()))

# common key-value
print(a.items() & b.items())


def common_keys_recursive(dict1, dict2):
    common_keys = dict1.keys() & dict2.keys()  # Find common keys at current level
    result = set(common_keys)

    for key in common_keys:
        if isinstance(dict1[key], dict) and isinstance(dict2[key], dict):
            # Recursively find common keys in nested dictionaries
            result |= common_keys_recursive(dict1[key], dict2[key])

    return result


# Example Usage
dict1 = {"a": 1, "b": {"x": 10, "y": 20, "z": {"p": 100}}, "c": 3}

dict2 = {"b": {"x": 15, "y": 25, "z": {"p": 200, "q": 300}}, "c": 5, "d": 6}

print(common_keys_recursive(dict1, dict2))
# Output: {'b', 'x', 'y', 'z', 'c', 'p'}
