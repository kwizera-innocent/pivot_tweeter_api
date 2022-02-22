package rw.kwizera.twitter_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rw.kwizera.twitter_api.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {
    
}
