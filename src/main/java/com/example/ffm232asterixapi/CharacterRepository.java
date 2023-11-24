package com.example.ffm232asterixapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends MongoRepository<Character, String> {

    public Optional<Character> findCharacterByAgeAndProfession(int age, String profession);

    public List<Character> findCharactersByAge(int age);
}
