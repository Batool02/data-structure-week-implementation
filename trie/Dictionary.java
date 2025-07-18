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
    private LetterNode root;

    public Dictionary() {
        root = new LetterNode();
    }

    public void addWord(String word) {
        LetterNode current = root;
        for (char letter : word.toCharArray()) {
            current.nextLetters.putIfAbsent(letter, new LetterNode());
            current = current.nextLetters.get(letter);
        }
        current.isWordEnd = true;
    }

    public boolean findWord(String word) {
        LetterNode current = root;
        for (char letter : word.toCharArray()) {
            if (!current.nextLetters.containsKey(letter)) {
                return false;
            }
            current = current.nextLetters.get(letter);
        }
        return current.isWordEnd;
    }

    public boolean startsWithPrefix(String prefix) {
        LetterNode current = root;
        for (char letter : prefix.toCharArray()) {
            if (!current.nextLetters.containsKey(letter)) {
                return false;
            }
            current = current.nextLetters.get(letter);
        }
        return true;
    }

    public List<String> suggestWords(String prefix) {
        List<String> results = new ArrayList<>();
        LetterNode current = root;

        for (char letter : prefix.toCharArray()) {
            if (!current.nextLetters.containsKey(letter)) {
                return results;
            }
            current = current.nextLetters.get(letter);
        }

        collectWords(current, prefix, results);
        return results;
    }

    private void collectWords(LetterNode node, String word, List<String> result) {
        if (node.isWordEnd) {
            result.add(word);
        }
        for (char c : node.nextLetters.keySet()) {
            collectWords(node.nextLetters.get(c), word + c, result);
        }
    }
}

