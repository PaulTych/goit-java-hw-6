public class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            if (word.length() <= 3) {
                result.append(word.toUpperCase());
            } else {
                result.append(word.toLowerCase());
            }
                result.append(" ");
        }
        return result.toString().trim();
    }
}
