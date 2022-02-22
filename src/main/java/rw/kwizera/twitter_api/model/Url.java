package rw.kwizera.twitter_api.model;

public class Url {
    private String display_Url;
    private String expanded_url;
    private int[] indices;
    private String url;
    public String getDisplay_Url() {
        return display_Url;
    }
    public void setDisplay_Url(String display_Url) {
        this.display_Url = display_Url;
    }
    public String getExpanded_url() {
        return expanded_url;
    }
    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }
    public int[] getIndices() {
        return indices;
    }
    public void setIndices(int[] indices) {
        this.indices = indices;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Url(String display_Url, String expanded_url, int[] indices, String url) {
        this.display_Url = display_Url;
        this.expanded_url = expanded_url;
        this.indices = indices;
        this.url = url;
    }
    public Url() {
    }

}
