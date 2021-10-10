public class DoubleSpaceCleaner {
    public String clean(String phrase){
        return phrase.replaceAll(" \s{2,}"," ").trim();
    }
}
