package week05d02;

public class ChangeLetter {

    public String changeVowels(String text) {

        String replaced = text.replaceAll("[aeiouAEIOU]", "*");

        return replaced;

    }

}
