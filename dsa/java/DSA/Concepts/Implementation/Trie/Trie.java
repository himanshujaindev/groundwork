package DataStructures.Implementation.Trie;

class TrieNode {

    // R links to node children
    private TrieNode[] links;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }

    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (char ch : word.toCharArray()) {
            if (!cur.containsKey(ch))
                cur.put(ch, new TrieNode());
            cur = cur.get(ch);
        }
        cur.setEnd();
    }

    private TrieNode searchPrefix(String prefix) {
        TrieNode cur = root;
        for (char ch : prefix.toCharArray()) {
            if (!cur.containsKey(ch)) {
                return null;
            }
            cur = cur.get(ch);
        }

        return cur;
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        if (node != null && node.isEnd())
            return true;
        return false;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        if (node == null)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple")); // return True
        System.out.println(trie.search("app")); // return False
        System.out.println(trie.startsWith("app")); // return True
        trie.insert("app");
        System.out.println(trie.search("app")); // return True
    }
}
