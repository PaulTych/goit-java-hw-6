public class WaterCounter {
    public double count(String text){
        int charLength = text.replaceAll(" ","").length();
        return (double) (text.length()-charLength)/text.length();
    }
}
