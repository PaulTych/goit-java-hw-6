import java.util.regex.*;

public class WordDeleter {
    public String remove(String phrase, String[] words){
        String result = " "+phrase+" ";
        for ( String word:words) {
            result = result.replaceAll(" "+word+" "," ");
        }
        return result.trim();
    }
}
