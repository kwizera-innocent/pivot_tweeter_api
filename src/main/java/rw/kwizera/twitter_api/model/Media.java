package rw.kwizera.twitter_api.model;

public class Media {
    private String display_url;
    private String expanded_url;
    private int id;
    private String id_str;
    private int[] indices;
    private String media_url;
    private MediaSize sizes;
    private int source_status_id;
    private int source_status_id_str;
    private String type;
    private String url;
    public String getDisplay_url() {
        return display_url;
    }
    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }
    public String getExpanded_url() {
        return expanded_url;
    }
    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getId_str() {
        return id_str;
    }
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }
    public int[] getIndices() {
        return indices;
    }
    public void setIndices(int[] indices) {
        this.indices = indices;
    }
    public String getMedia_url() {
        return media_url;
    }
    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }
    public MediaSize getSizes() {
        return sizes;
    }
    public void setSizes(MediaSize sizes) {
        this.sizes = sizes;
    }
    public int getSource_status_id() {
        return source_status_id;
    }
    public void setSource_status_id(int source_status_id) {
        this.source_status_id = source_status_id;
    }
    public int getSource_status_id_str() {
        return source_status_id_str;
    }
    public void setSource_status_id_str(int source_status_id_str) {
        this.source_status_id_str = source_status_id_str;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}
