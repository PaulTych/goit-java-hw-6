public class MathDetector {
    public boolean isMath(String text) {
        return  (text.matches("(.*)[0-9](.*)[0-9](.*)")&&text.indexOf('=') > 0 &&
                (text.indexOf('+') > 0 | text.indexOf('-') > 0 | text.indexOf('*') > 0 | text.indexOf('/')>0));
    }
}
