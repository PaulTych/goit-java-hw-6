public class SummaryCreator {
    public String create(String text) {
        String result="";
        if (text.length() >= 16) {
            if (text.charAt(15) == ' ') {
                return text.substring(0, 15);
            } else {
                return text.substring(0, 15)+"...";
            }
        } else {
            return text;
        }
    }
}
