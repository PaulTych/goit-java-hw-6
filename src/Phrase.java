import java.util.Arrays;

public class Phrase {
    private final String[] words;

    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words,words.length);
    }

    @Override
    public String toString(){
        String result="";
        for (String str: words) {
            result += str+" ";
        }
        return result.trim();
    }
}
