public class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            result.append(names[i].split(" ")[0]);
            if (i != names.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}

