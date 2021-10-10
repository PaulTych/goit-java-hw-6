import java.util.Locale;

public class WordSplitter {
    public String[] split(String phrase){
    return phrase.toLowerCase().split(" {1,}");
    }
}
