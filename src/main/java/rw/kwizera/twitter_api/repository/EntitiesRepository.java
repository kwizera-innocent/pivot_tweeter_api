package rw.kwizera.twitter_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rw.kwizera.twitter_api.model.Entities;

public interface EntitiesRepository extends JpaRepository<Entities, Long> {
    
}
