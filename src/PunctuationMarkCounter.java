public class PunctuationMarkCounter {
    public int count(String phrase) {
        String template = ".,!:;";
        char[] chr = phrase.toCharArray();
        int cnt = 0;

        for (char c : chr) {
            if (template.indexOf(c) >= 0) {
                cnt++;
            }
//        return phrase.length()-phrase.replace("!","")
//                                     .replace(".","")
//                .replace(",","")
//                .replace(":","")
//                .replace(";","").length();

        }
        return cnt;
    }
}
