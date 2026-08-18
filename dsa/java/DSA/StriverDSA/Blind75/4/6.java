
class Solution {

    /*
    https://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/

    create directed graph -> 
        traverse adj words
        compare chars
        mismatch -> create edge of char from word1 to word2
    if contains cycle -> valid order is not possible
    else -> topological sort


    o(w+t)
     */
    void printOrder(String[] words) {
        // create graph
        // check cycle
        // topological sort
        System.out.println("TODO");
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        String[] words = {"baa", "abcd", "abca", "cab", "cad"};
        sc.printOrder(words);
    }
}
