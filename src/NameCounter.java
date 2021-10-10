import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameCounter {
    public int count(String text){
        Pattern pattern = Pattern.compile("\\p{Upper}\\p{Lower}+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

}
