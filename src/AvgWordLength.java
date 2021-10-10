public class AvgWordLength {
    public double count(String phrase){
        double spaceCount = phrase.length()-phrase.replace(" ","").length();
        return (phrase.length()-spaceCount) / (spaceCount+1);
    }
}
