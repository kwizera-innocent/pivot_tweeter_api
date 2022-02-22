package rw.kwizera.twitter_api.batch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rw.kwizera.twitter_api.model.Entities;
import rw.kwizera.twitter_api.model.Tweet;
import rw.kwizera.twitter_api.model.User;
import rw.kwizera.twitter_api.repository.EntitiesRepository;
import rw.kwizera.twitter_api.repository.TweetRepository;
import rw.kwizera.twitter_api.repository.UserRepository;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Tweet> {

    private TweetRepository tweetRepository;
    private UserRepository userRepository;
    private EntitiesRepository entitiesRepository;

    @Autowired
    public DBWriter (TweetRepository tweetRepository, UserRepository userRepository, EntitiesRepository entitiesRepository) {
        this.tweetRepository = tweetRepository;
        this.userRepository = userRepository;
        this.entitiesRepository = entitiesRepository;
    }

    @Override
    public void write(List<? extends Tweet> tweets) throws Exception{

        for(Tweet tweet : tweets) {

            if (tweet.getRetweeted_status() != null)    {
                userRepository.save(tweet.getRetweeted_status().getUser());
                entitiesRepository.save(tweet.getRetweeted_status().getEntities());
                tweetRepository.save(tweet.getRetweeted_status());
            }
            // System.out.println("Data Saved for users: " + tweet.getUser());
            userRepository.save(tweet.getUser());

            // System.out.println("Data Saved for users: " + tweet.getEntities());
            entitiesRepository.save(tweet.getEntities());

            System.out.println("Data Saved for Tweets: " + tweets);
            tweetRepository.save(tweet);
        }
        // System.out.println("Data Saved for users: " + users);

        // System.out.println("Data Saved for Tweets: " + tweets);
        // tweetRepository.saveAll(tweets);
    }
}
