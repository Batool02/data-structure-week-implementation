package trie;

import java.util.*;


class LetterNode {
    Map<Character, LetterNode> nextLetters;
    boolean isWordEnd;

    public LetterNode() {
        nextLetters = new HashMap<>();
        isWordEnd = false;
    }
}


public class Dictionary {
    private final LetterNode root;

    // constructor
    public Dictionary() {
        root = new LetterNode();
    }


    public void addWord(String word) {
        LetterNode current = root;
        for (char letter : word.toCharArray()) {
            // if the letter does not exist, create a new node
            current.nextLetters.putIfAbsent(letter, new LetterNode());
            // move to the next node
            current = current.nextLetters.get(letter);
        }
        // mark the end of a word
        current.isWordEnd = true;
    }


    public boolean findWord(String word) {
        LetterNode current = root;
        for (char letter : word.toCharArray()) {
            if (!current.nextLetters.containsKey(letter)) {
                return false; // character path not found
            }
            current = current.nextLetters.get(letter);
        }
        return current.isWordEnd; // only return true if it's a full word
    }


    public boolean startsWithPrefix(String prefix) {
        LetterNode current = root;
        for (char letter : prefix.toCharArray()) {
            if (!current.nextLetters.containsKey(letter)) {
                return false; // prefix path not found
            }
            current = current.nextLetters.get(letter);
        }
        return true;
    }


    public List<String> suggestWords(String prefix) {
        List<String> results = new ArrayList<>();
        LetterNode current = root;

        // traverse to the end of the prefix
        for (char letter : prefix.toCharArray()) {
            if (!current.nextLetters.containsKey(letter)) {
                return results; // no suggestions if prefix doesn't exist
            }
            current = current.nextLetters.get(letter);
        }

        // collect all possible completions from the current node
        collectWords(current, prefix, results);
        return results;
    }


    private void collectWords(LetterNode node, String word, List<String> result) {
        if (node.isWordEnd) {
            result.add(word); // add word if it ends here
        }

        // explore all children
        for (char c : node.nextLetters.keySet()) {
            collectWords(node.nextLetters.get(c), word + c, result);
        }
    }
}
