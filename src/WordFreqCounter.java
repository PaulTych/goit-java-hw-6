import java.util.Locale;

public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] sentence = phrase.toLowerCase().split(" {1,}");
        int count = 0;
        for (String curString : sentence
        ) {
            count = curString.equals(word.toLowerCase())?count+1:count;
        }
        return (float) count/sentence.length;
    }
}
