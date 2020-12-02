package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {
        StringBuilder output = new StringBuilder();
        String[] wordArray = words.split("\\s+");

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equals(word)) {
                wordArray[i] = "";
            }
        }
        for (int i = 0; i < wordArray.length; i++) {
            if (!wordArray[i].equals("") && i == 0) {
                output.append(wordArray[i]);
            }
            else if (!wordArray[i].equals("")) {
                output.append(" " + wordArray[i]);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        WordEraser wordEraser = new WordEraser();

        System.out.println(wordEraser.eraseWord("The quick brown fox jumped over the lazy dog", "fox"));
    }

}
