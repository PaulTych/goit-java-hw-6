import java.util.Arrays;

public class GooQueryTest {
    public static void main(String[] args) {
        GooQuery query = new GooQuery("en", "capital");
        System.out.println("------------------------------------------------");
        System.out.println("Task 1:");
        System.out.println(query.getLanguage()); //en
        System.out.println(query.getText());//capital
        System.out.println(query);//Searching [capital], using language: en

        System.out.println("------------------------------------------------");
        System.out.println("Task 2:");
        System.out.println(new GooWordStat("human", 10)); //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("mars", 10000)); //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("space", 9965499)); //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("life", 564785654)); //Word is [life], search freq is EXTRA HIGH

        System.out.println("------------------------------------------------");
        System.out.println("Task 3:");
        System.out.println(new GooSearchResult("https://test.com").parseDomain()); //test.com
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());//apple.in.mars

        System.out.println("------------------------------------------------");
        System.out.println("Task 4:");
        String[] words = {"alpha", "beta", "gamma"};
        Phrase phrase = new Phrase(words);

        System.out.println(phrase);         //alpha beta gamma
        words[0] = "zero";
        System.out.println(phrase); //alpha beta gamma

        System.out.println("------------------------------------------------");
        System.out.println("Task 5:");
        WordSplitter wordSplitter = new WordSplitter();
        String[] wordsArray = wordSplitter.split("Hello      world");
        System.out.println(Arrays.toString(wordsArray));        //[hello, world]

        System.out.println("------------------------------------------------");
        System.out.println("Task 6:");
        PunctuationMarkCounter counter = new PunctuationMarkCounter();
        System.out.println(counter.count("Hello, world!"));//2
        System.out.println(counter.count("This is Sparta!"));//1
        System.out.println(counter.count("End.")); //1

        System.out.println("------------------------------------------------");
        System.out.println("Task 7:");
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();
        System.out.println(cleaner.clean("Hello World")); //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));//Hello World

        System.out.println("------------------------------------------------");
        System.out.println("Task 8:");
        WordFreqCounter freqCounter = new WordFreqCounter();
        System.out.println(freqCounter.countFreq("Hello Java", "java")); //0.5
        System.out.println(freqCounter.countFreq("nunux foxuylxupiw Sajobuyvle aco gobipa", "Sajobuyvle")); //0

        System.out.println("------------------------------------------------");
        System.out.println("Task 9:");
        byte[] startBytes = {74, 97, 86, 97};
        System.out.println(new StringByteWorker().process(startBytes));//java

        System.out.println("------------------------------------------------");
        System.out.println("Task 10:");
        System.out.println(new ShortWordCounter().count("Java is great language", 2)); //1
        System.out.println(new ShortWordCounter().count("Java is great language", 4)); //2
        System.out.println(new ShortWordCounter().count("Java is great language", 5)); //3
        System.out.println(new ShortWordCounter().count("Java is great language", 100));//4

        System.out.println("------------------------------------------------");
        System.out.println("Task 11:");
        PalindromeCounter counterPalidrome = new PalindromeCounter();
        System.out.println(counterPalidrome.count("Level done!")); //1
        System.out.println(counterPalidrome.count("No palindromes")); //0

        System.out.println("------------------------------------------------");
        System.out.println("Task 12:");
        UniqueCharCounter charCounter = new UniqueCharCounter();
        System.out.println(charCounter.count("123")); //3
        System.out.println(charCounter.count("ab100")); //4
        System.out.println(charCounter.count("Java")); //3
        System.out.println(charCounter.count("")); //3

        System.out.println("------------------------------------------------");
        System.out.println("Task 13:");
        WordDeleter wordDeleter = new WordDeleter();
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));//Hello
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));//This Sparta

        System.out.println("------------------------------------------------");
        System.out.println("Task 14:");
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));        //false
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish")); //true

        System.out.println("------------------------------------------------");
        System.out.println("Task 15:");
        System.out.println(new DigitText().detect("23 50"));//true
        System.out.println(new DigitText().detect("Year 1990"));//false

        System.out.println("------------------------------------------------");
        System.out.println("Task 16:");
        SummaryCreator summaryCreator = new SummaryCreator();
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase)); //Mars
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));//Java is very po...

        System.out.println("------------------------------------------------");
        System.out.println("Task 17:");
        System.out.println(new MathDetector().isMath("2+2=4"));//true
        System.out.println(new MathDetector().isMath("1992 is great year"));//false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));//false

        System.out.println("------------------------------------------------");
        System.out.println("Task 18:");
        System.out.println(new AvgWordLength().count("Launch Rocket")); //6
        System.out.println(new AvgWordLength().count("Life is strange thing")); //4.5
        System.out.println(new AvgWordLength().count("v k x t hebyhyylfaweitn d nokyqohav c k go b"));

        System.out.println("------------------------------------------------");
        System.out.println("Task 19:");
        DigitExtracter digitExtracter = new DigitExtracter();
        int[] extracted = digitExtracter.extract("april 5, year 2000");
        System.out.println(Arrays.toString(extracted)); //[5, 2, 0, 0, 0]

        System.out.println("------------------------------------------------");
        System.out.println("Task 20:");
        System.out.println(new BigOrSmall().calculate("Java"));//Small
        System.out.println(new BigOrSmall().calculate("JAVA"));//Big
        System.out.println(new BigOrSmall().calculate("jAvA"));//Same

        System.out.println("------------------------------------------------");
        System.out.println("Task 21:");
        System.out.println(new WordCombine().canCombine("Forest", "tor")); //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama")); //true
        System.out.println(new WordCombine().canCombine("War", "Piece")); //false
        System.out.println(new WordCombine().canCombine( "MGAUWQDD","WUQAG"));

        System.out.println("------------------------------------------------");
        System.out.println("Task 22:");
        System.out.println(new WaterCounter().count("Moon invaders"));//0.07692307692307693
        System.out.println(new WaterCounter().count("NoWater")); //0


        System.out.println("------------------------------------------------");
        System.out.println("Task 23:");
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com")); //true
        System.out.println(new EmailDetector().isPresent("No email present, but @ there")); //false

        System.out.println("------------------------------------------------");
        System.out.println("Task 24:");
        System.out.println(new NameCounter().count("Mars is great planet")); //1
        System.out.println(new NameCounter().count("Moon is near Earth")); //2
        System.out.println(new NameCounter().count("SPACE IS GREAT")); //0

        System.out.println("------------------------------------------------");
        System.out.println("Task 25:");
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));//102030

        System.out.println("------------------------------------------------");
        System.out.println("Task 26:");
        String[] words1 = {"Life", "is", "great", "thing"};
        System.out.println(new PhraseMaker().join(words1));//life IS great thing

        System.out.println("------------------------------------------------");
        System.out.println("Task 27:");
        System.out.println(new PalindromeDetector().isPalindrome("Java"));//false
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));//true

        System.out.println("------------------------------------------------");
        System.out.println("Task 28:");
        Object[] data = {"Hello", 20L, 3.14f, true};
        System.out.println(new ObjectWorker().join(data)); //Hello 20 3.14 true

        System.out.println("------------------------------------------------");
        System.out.println("Task 29:");
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};
        System.out.println(new NameParser().parse(names));//John, Bill, Nigua
    }
}
