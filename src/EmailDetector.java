public class EmailDetector {
    public boolean isPresent(String text){
        return text.matches("(.*)(\\S{2,})@(\\S{2,})(.*)");
    }
}
