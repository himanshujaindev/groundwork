a = set()
for i in range(10):
    a.add(i)
print(a)

b = set()
for i in range(5, 14):
    b.add(i)
print(b)

print(a.union(b))
print(a.intersection(b))
print(a.difference(b))

a.intersection_update(b)
print(a)
