package trie;

public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        dict.addWord("cat");
        dict.addWord("car");
        dict.addWord("cart");
        dict.addWord("lion");

        System.out.println(dict.suggestWords("ca"));
        System.out.println(dict.suggestWords("l"));
        System.out.println(dict.suggestWords("a"));
    }
}

