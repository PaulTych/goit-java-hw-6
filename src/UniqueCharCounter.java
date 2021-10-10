import java.util.Arrays;

public class UniqueCharCounter {
    public int count(String phrase){
        int uniqueChars = 1;
        if (phrase.length()==0 ){
            return 0;
        }
        char[] characters = phrase.toCharArray();
        Arrays.sort(characters);
        for (int  i=1; i<characters.length; i++ ) {
            if ( characters[i-1] != characters[i])
                uniqueChars++;
        }
        return uniqueChars;
    }
}
