import java.util.Locale;

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String[] sensitiveWords = {"pass", "key", "login", "email"};
        boolean result = false;
        for (String curString : sensitiveWords) {
            if (phrase.toLowerCase().contains(curString)) {
                result = true;
                break;
            }
        }
        return result;
    }
}