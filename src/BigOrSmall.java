public class BigOrSmall {
    public String calculate(String text) {
        int upperCaseCount = (text.length() - text.replaceAll("\\p{Upper}", "").length());
        int lowerCaseCount = (text.length() - text.replaceAll("\\p{Lower}", "").length());
        if (upperCaseCount > lowerCaseCount) {
            return "Big";
        } else if (upperCaseCount < lowerCaseCount) {
            return "Small";
        } else {
            return "Same";
        }
    }
}


