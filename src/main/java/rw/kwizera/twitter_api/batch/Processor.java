package rw.kwizera.twitter_api.batch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import rw.kwizera.twitter_api.model.Tweet;

@Component
public class Processor implements ItemProcessor<Tweet, Tweet> {

    private Set<Tweet> tweets;

    public Processor() {
        tweets = new HashSet<>();
    }

    @Override
    public Tweet process(Tweet tweet) throws Exception {
        
        // System.out.println(String.format("Converted from [%s] to [%s]", tweet.getId(), tweet.getCreated_at()));
        if(!isDuplicate(tweet) && filterLanguages(tweet) && isContactTweet(tweet) && isMalformed(tweet))
            return tweet;
        return null;
    }
    
    public boolean filterLanguages(Tweet tweet) {
        List<String> langs = Arrays.asList("ar", "en", "fr", "in", "pt", "es", "tr", "ja");

        if (!langs.contains(tweet.getLang()))
            return false;
        return true;
    }

    public boolean isContactTweet(Tweet tweet) {
        if(tweet.getIn_reply_to_user_id() != 0 && tweet.getRetweeted_status() !=null)
            return false;
        return true;
    }

    public boolean isMalformed(Tweet tweet) {

        if (tweet.getCreated_at().isEmpty() || tweet.getCreated_at() == null
            && tweet.getText().isEmpty() || tweet.getText() == null
            && tweet.getEntities().getHashtags() == null || tweet.getEntities().getHashtags().size() == 0
            && tweet.getUser().getId() == 0 && tweet.getUser().getId_str() == null) 
            return false;
        return true;
        
    }

    public boolean isDuplicate(Tweet tweet) {
        if(tweets.stream().filter(t -> t.getId() == tweet.getId()).findFirst().isPresent()){
            System.out.println(tweet.getId());
            System.out.println("tweet.getId()");
            return true;
        }
        tweets.add(tweet);
        return false;
    }

}
