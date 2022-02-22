package rw.kwizera.twitter_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rw.kwizera.twitter_api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
