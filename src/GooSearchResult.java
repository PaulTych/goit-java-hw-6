public class GooSearchResult {
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        int start = url.indexOf("//", 1) + 2;
        int finish = url.indexOf('/', start);
        if (start <= 0) {
            return "not the URL";
        }
        if (finish <= 0) {
            finish = url.length();
        }
        return url.substring(start, finish);
    }
}
