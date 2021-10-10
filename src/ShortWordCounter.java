public class ShortWordCounter {
    public int count(String phrase, int minLength) {
        String[] word = phrase.toLowerCase().split(" {1,}");
        int count=0;
        for (String str : word) {
          count=str.length()<=minLength?count+1:count;
        }
        return count;
    }
}
