package rw.kwizera.twitter_api.model;

import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entities {
    @Id
    @GeneratedValue
    private long id;
    @Embedded
    // @OneToMany
    @ElementCollection
    private List<Hashtag> hashtags;
    // private Media[] media;
    // private Url[] urls;
    // private UserMention[] user_mentions;
    // private Symbol[] symbols;
    // private Poll[] polls;
    public List<Hashtag> getHashtags() {
        return hashtags;
    }
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }
    // public Media[] getMedia() {
    //     return media;
    // }
    // public void setMedia(Media[] media) {
    //     this.media = media;
    // }
    // public Url[] getUrls() {
    //     return urls;
    // }
    // public void setUrls(Url[] urls) {
    //     this.urls = urls;
    // }
    // public UserMention[] getUser_mentions() {
    //     return user_mentions;
    // }
    // public void setUser_mentions(UserMention[] user_mentions) {
    //     this.user_mentions = user_mentions;
    // }
    // public Symbol[] getSymbols() {
    //     return symbols;
    // }
    // public void setSymbols(Symbol[] symbols) {
    //     this.symbols = symbols;
    // }
    // public Poll[] getPolls() {
    //     return polls;
    // }
    // public void setPolls(Poll[] polls) {
    //     this.polls = polls;
    // }
}
