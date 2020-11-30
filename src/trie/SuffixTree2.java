package trie;

import java.util.LinkedList;
import java.util.List;

class SuffixTrieNode2 {

    final static int MAX_CHAR = 256;

    SuffixTrieNode[] children = new SuffixTrieNode[MAX_CHAR];
    List<Integer> indexes;

    SuffixTrieNode2() // Constructor
    {
        indexes = new LinkedList<Integer>();
        for (int i = 0; i < MAX_CHAR; i++)
            children[i] = null;
    }
    void insertSuffix(String s, int index) {
        indexes.add(index);
        if (s.length() > 0) {
            char cIndex = s.charAt(0);
            if (children[cIndex] == null)
                children[cIndex] = new SuffixTrieNode();

            children[cIndex].insertSuffix(s.substring(1),index + 1);
        }
    }
    List<Integer> search(String s) {
        if (s.length() == 0)
            return indexes;
        if (children[s.charAt(0)] != null) {
            System.out.println(children[s.charAt(0)]);
            System.out.println(s.substring(1));
            return (children[s.charAt(0)]).search(s.substring(1));
        }
        else
            return null;
    }
}
class SuffixTree2 {

    SuffixTrieNode2 root = new SuffixTrieNode2();

    SuffixTree2(String txt) {
        for (int i = 0; i < txt.length(); i++) {
//            System.out.println(txt.substring(i));
            root.insertSuffix(txt.substring(i), i);
        }
    }

    void search_tree(String pat) {
        List<Integer> result = root.search(pat);
        if (result == null)
            System.out.println("Pattern not found");
        else {

            int patLen = pat.length();

            for (Integer i : result)
                System.out.println("Pattern found at position " +
                        (i - patLen));
        }
    }

    public static void main(String args[]) {
        String txt = "abcabcabdefabcgafafhjabcfrt";
        SuffixTree2 S = new SuffixTree2(txt);

        System.out.println("Search for 'abc'");
        S.search_tree("abc");
    }
}
