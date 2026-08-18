/*
bfs(v) {
    enqueue(v)
    print(v)
    visit[v] = 1

    while !qempty()
        x = dequeue()
        for i: 0 -> n
            if adj[i][x] && !visit[i]
                print(i)
                enquque(i)
                visit[i] = 1
}
*/
