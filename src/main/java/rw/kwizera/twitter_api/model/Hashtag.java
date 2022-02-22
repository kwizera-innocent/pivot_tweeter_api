package rw.kwizera.twitter_api.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;


@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class Hashtag {
    // private int[] indices;

    // @JsonProperty("text")
    private String text;
    // public int[] getIndices() {
    //     return indices;
    // }
    // public void setIndices(int[] indices) {
    //     this.indices = indices;
    // }

    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text = text;
    }

}
