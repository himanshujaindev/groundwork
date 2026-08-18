def dfs(node):
    if node in oldToNew:
        return oldToNew[node]

    copy = Node(node.val)
    oldToNew[node] = copy  # hm: old -> new

    for nei in node.neighbors:
        copy.neighbors.append(dfs(nei))

    return copy
