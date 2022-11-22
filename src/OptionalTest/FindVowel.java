package OptionalTest;

import java.util.Arrays;

public class FindVowel {
    public int findVowel(String str){
        return Arrays.asList("a","e","i","o","u").stream()
                .mapToInt(vowel->str.length() - str.replace(vowel,"").length())
                .sum();
    }
}
