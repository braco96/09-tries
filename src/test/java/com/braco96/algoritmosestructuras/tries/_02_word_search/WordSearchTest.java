package com.braco96.algoritmosestructuras.tries._02_word_search;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

import com.braco96.algoritmosestructuras.tries._02_word_search.WordSearch;

public class WordSearchTest {

  @Test
  public void wordSearchTest() {
    WordSearch wordSearch = new WordSearch();

    char[][] board =
        new char[][] {
          new char[] {'p', 'e', 'r', 'o'},
          new char[] {'a', 't', 'a', 'e'},
          new char[] {'t', 'e', 'l', 'v'},
          new char[] {'o', 'f', 'l', 'v'}
        };

    String[] words = new String[] {"pero", "pato", "comida", "veo", "pata"};
    String[] expectedWords = new String[] {"pero", "pato", "veo", "pata"};
    Arrays.sort(expectedWords);
    List<String> result = wordSearch.findWords(board, words);
    Collections.sort(result);
    assertArrayEquals(expectedWords, result.toArray());
  }
}
