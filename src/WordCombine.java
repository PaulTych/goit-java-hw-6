import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        boolean prevData=true;
        char[]  targetChars = targetWord.toLowerCase().toCharArray();
        for (char i:targetChars){
            prevData = prevData & (sourceWord.toLowerCase().indexOf(i)>=0);
        }

        return prevData;
    }
}
