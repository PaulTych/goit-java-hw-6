public class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder result = new StringBuilder();

        for(Object curObj : objects) {
            result.append(curObj).append(" ");
        }
        return result.toString().trim();
    }
}
