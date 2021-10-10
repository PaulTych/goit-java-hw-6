public class DigitExtracter {
    public int[] extract(String text){
        int count = text.length()-text.replaceAll("[0-9]","").length();
        int[] digit = new int[count];
        int j =0;
        for (int i=0;i<text.length();i++){
            if (Character.getNumericValue(text.charAt(i))>=0&&Character.getNumericValue(text.charAt(i))<=9 ){
                digit[j] = Character.getNumericValue(text.charAt(i));
                j ++;
            }
        }
        return digit;
    }
}
