public class PalindromeCounter {
    public int count(String phrase){
        int cntPalidromes=0;
        String[] word = phrase.toLowerCase().split(" {1,}");
        for (String curStr: word) {
            StringBuilder sb = new StringBuilder(curStr);
            String result = sb.reverse().toString();
            if (curStr.equals(result)){
                cntPalidromes ++;
            }
        }
        return cntPalidromes;
    }
}
