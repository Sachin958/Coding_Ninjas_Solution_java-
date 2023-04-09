package Tries_and_Huffman;

public class TrieUse {
    public static void main(String args[]){
        Trie t = new Trie();
        t.add("NOTE");
        t.add("AND");
        t.add("OR");
        System.out.println(t.search("AND"));
        t.remove("OR");
        t.remove("AND");
        System.out.println(t.search("AND"));
        System.out.println(t.search("OR"));
    }
}
