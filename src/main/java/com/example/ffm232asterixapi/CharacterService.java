package com.example.ffm232asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {
    private final CharacterRepository repo;

    public List<Character> getAllCharacter(){
        return repo.findAll();
    }

    public Character saveCharacter(Character character) {
        return repo.save(character);
    }

    public Character findById(String id) {
        return repo.findById(id).orElseThrow();
    }

    public Character changeCharacter(Character byId) {
        repo.deleteById(byId.id());
        return repo.save(byId);
    }

    public void deleteCharacterById(String id) {
        repo.deleteById(id);
    }
}
