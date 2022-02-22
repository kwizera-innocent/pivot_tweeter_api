package rw.kwizera.twitter_api.model;

import java.util.Arrays;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Tweet {

    private String created_at;
    @Id
    private long id;
    private String id_str;
    private String text;
    // private String source;
    // private boolean truncated;
    private long in_reply_to_status_id;
    // private String in_reply_to_status_id_str;
    private long in_reply_to_user_id;
    // private String getIn_reply_to_user_id_str;
    // private String in_reply_to_screen_name;
    // private Tweet ret;
    // @Embedded
    @OneToOne
    private User user;
    // private Object geo;
    // private Coordinates coordinates;
    // private Places place;
    // private Object contributors;
    private int retweet_count;
    private int favorite_count;
    @OneToOne
    private Entities entities;
    // private Symbol[] symbols;
    // private Url[] urls;
    // private boolean favorited;
    private boolean retweeted;
    // private boolean possibly_sensitive;
    // private String filter_level;
    private String lang;

    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getId_str() {
        return id_str;
    }
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    // public String getSource() {
    //     return source;
    // }
    // public void setSource(String source) {
    //     this.source = source;
    // }
    // public boolean isTruncated() {
    //     return truncated;
    // }
    // public void setTruncated(boolean truncated) {
    //     this.truncated = truncated;
    // }
    public long getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }
    public void setIn_reply_to_status_id(long in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }
    // public String getIn_reply_to_status_id_str() {
    //     return in_reply_to_status_id_str;
    // }
    // public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
    //     this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    // }
    // public long getIn_reply_to_user_id() {
    //     return in_reply_to_user_id;
    // }
    // public void setIn_reply_to_user_id(long in_reply_to_user_id) {
    //     this.in_reply_to_user_id = in_reply_to_user_id;
    // }
    // public String getGetIn_reply_to_user_id_str() {
    //     return getIn_reply_to_user_id_str;
    // }
    
    public Tweet() {
    }
    public Tweet(String created_at, int id, String id_str, String text, String source, boolean truncated,
            int in_reply_to_status_id, String in_reply_to_status_id_str, int in_reply_to_user_id,
            String getIn_reply_to_user_id_str, String in_reply_to_screen_name, User user, Object geo,
            Coordinates coordinates, Places place, Object contributors, int retweet_count, int favorite_count,
            Entities entities, Symbol[] symbols, Url[] urls, boolean favorited, boolean retweeted,
            boolean possibly_sensitive, String filter_level, String lang) {
        this.created_at = created_at;
        this.id = id;
        this.id_str = id_str;
        this.text = text;
        // this.source = source;
        // this.truncated = truncated;
        // this.in_reply_to_status_id = in_reply_to_status_id;
        // this.in_reply_to_status_id_str = in_reply_to_status_id_str;
        // this.in_reply_to_user_id = in_reply_to_user_id;
        // this.getIn_reply_to_user_id_str = getIn_reply_to_user_id_str;
        // this.in_reply_to_screen_name = in_reply_to_screen_name;
        this.user = user;
        // this.geo = geo;
        // this.coordinates = coordinates;
        // this.place = place;
        // this.contributors = contributors;
        this.retweet_count = retweet_count;
        this.favorite_count = favorite_count;
        this.entities = entities;
        // this.symbols = symbols;
        // this.urls = urls;
        // this.favorited = favorited;
        // this.retweeted = retweeted;
        // this.possibly_sensitive = possibly_sensitive;
        // this.filter_level = filter_level;
        this.lang = lang;
    }
    // public void setGetIn_reply_to_user_id_str(String getIn_reply_to_user_id_str) {
    //     this.getIn_reply_to_user_id_str = getIn_reply_to_user_id_str;
    // }
    // public String getIn_reply_to_screen_name() {
    //     return in_reply_to_screen_name;
    // }
    // public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
    //     this.in_reply_to_screen_name = in_reply_to_screen_name;
    // }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    // public Object getGeo() {
    //     return geo;
    // }
    // public void setGeo(Object geo) {
    //     this.geo = geo;
    // }
    // public Coordinates getCoordinates() {
    //     return coordinates;
    // }
    // public void setCoordinates(Coordinates coordinates) {
    //     this.coordinates = coordinates;
    // }
    // public Places getPlace() {
    //     return place;
    // }
    // public void setPlace(Places place) {
    //     this.place = place;
    // }
    // public Object getContributors() {
    //     return contributors;
    // }
    // public void setContributors(Object contributors) {
    //     this.contributors = contributors;
    // }
    public int getRetweet_count() {
        return retweet_count;
    }
    public void setRetweet_count(int retweet_count) {
        this.retweet_count = retweet_count;
    }
    public int getFavorite_count() {
        return favorite_count;
    }
    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }
    public Entities getEntities() {
        return entities;
    }
    public void setEntities(Entities entities) {
        this.entities = entities;
    }
    // public Symbol[] getSymbols() {
    //     return symbols;
    // }
    // public void setSymbols(Symbol[] symbols) {
    //     this.symbols = symbols;
    // }
    // public Url[] getUrls() {
    //     return urls;
    // }
    // public void setUrls(Url[] urls) {
    //     this.urls = urls;
    // }
    // public boolean isFavorited() {
    //     return favorited;
    // }
    // public void setFavorited(boolean favorited) {
    //     this.favorited = favorited;
    // }
    public boolean isRetweeted() {
        return retweeted;
    }
    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }
    // public boolean isPossibly_sensitive() {
    //     return possibly_sensitive;
    // }
    // public void setPossibly_sensitive(boolean possibly_sensitive) {
    //     this.possibly_sensitive = possibly_sensitive;
    // }
    // public String getFilter_level() {
    //     return filter_level;
    // }
    // public void setFilter_level(String filter_level) {
    //     this.filter_level = filter_level;
    // }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    @Override
    public String toString() {
        return "Tweet [contributors=" + "" + ", coordinates=" + "coordinates" + ", created_at=" + created_at
                + ", entities=" + "entities" + ", favorite_count=" + favorite_count + ", favorited=" + "favorited"
                + ", filter_level=" + "filter_level" + ", geo=" + "geo" + ", getIn_reply_to_user_id_str="
                + "getIn_reply_to_user_id_str "+ ", id=" + id + ", id_str=" + id_str + ", in_reply_to_screen_name="
                + "in_reply_to_screen_name" + ", in_reply_to_status_id=" + in_reply_to_status_id
                + ", in_reply_to_status_id_str=" + "in_reply_to_status_id_str" + ", in_reply_to_user_id="
                + in_reply_to_user_id + ", lang=" + lang + ", place=" + "place" + ", possibly_sensitive="
                + "possibly_sensitive" + ", retweet_count=" + retweet_count + ", retweeted=" + retweeted + ", source="
                + "source" + ", symbols=" + "Arrays.toString(symbols)" + ", text=" + text + ", truncated=" + "truncated"
                + ", urls=" + "Arrays.toString(urls)" + ", user=" + user + "]";
    }

}
