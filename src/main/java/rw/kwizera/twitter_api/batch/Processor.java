package rw.kwizera.twitter_api.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import rw.kwizera.twitter_api.model.Tweet;

@Component
public class Processor implements ItemProcessor<Tweet, Tweet> {


    public Processor() {
    }

    @Override
    public Tweet process(Tweet tweet) throws Exception {
      
        System.out.println(String.format("Converted from [%s] to [%s]", tweet.getId(), tweet.getCreated_at()));
        return tweet;
    }
}
