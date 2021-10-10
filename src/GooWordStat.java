public class GooWordStat {
    private String word;
    private int freq;

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    @Override
    public String toString() {
        String textFreq;
        if (getFreq() < 1000) {
            textFreq = "LOW";
        } else if (getFreq() >= 1000 & getFreq() < 100000) {
            textFreq = "MEDIUM";
        } else if (getFreq() >= 100000 & getFreq() < 10000000) {
            textFreq = "HIGH";
        } else {
            textFreq = "EXTRA HIGH";
        }
        return "Word is [" + getWord() + "], search freq is " + textFreq;
    }
}
