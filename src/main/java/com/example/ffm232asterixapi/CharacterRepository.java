package com.example.ffm232asterixapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends MongoRepository<Character, String> {
}
