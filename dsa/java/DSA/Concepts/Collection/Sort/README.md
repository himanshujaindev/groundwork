```
Sort using lambda expression:

List<List<Integer>> toSort;
Collection.sort(toSort, (a,b) -> a.get(1) - b.get(1)); Type of a and b = List<Integer>


int[][] toSort;
Arrays.sort(toSort, (a,b) -> Integer.compare(a[0], b[0])); Type of a and b = int[]


Ascending = a - b;
Descending = b - a;
```
