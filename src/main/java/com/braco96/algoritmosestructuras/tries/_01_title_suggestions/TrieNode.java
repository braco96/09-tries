package com.braco96.algoritmosestructuras.tries._01_title_suggestions;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
  Map<Character, TrieNode> children;
  boolean isEndOfWord;

  public TrieNode() {
    children = new HashMap<Character, TrieNode>();
  }
}
