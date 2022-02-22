package rw.kwizera.twitter_api.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.batch.item.file.LineMapper;

import rw.kwizera.twitter_api.model.Tweet;

public class TweetJsonLineMapper implements LineMapper<Tweet> {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public Tweet mapLine(String line, int lineNumber) throws Exception {
        return mapper.readValue(line, Tweet.class);
    }

}