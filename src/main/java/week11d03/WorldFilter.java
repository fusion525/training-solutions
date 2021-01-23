package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WorldFilter {

    public static List<String> wordsWithChar(List<String> words, char c) {

        List<String> foundWords = new ArrayList<>();

        for (String word : words) {

                char[] wordCharacters = word.toCharArray();

                for (int i = 0; i<wordCharacters.length; i++) {
                    if (wordCharacters[i] == c) {
                        foundWords.add(word);
                        break;
                    }
                }
            }
            return foundWords;
        }

    }
