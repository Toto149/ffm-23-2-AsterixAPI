package com.example.ffm232asterixapi;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class CharacterService {

    private final CharacterRepository repo;
    private final IdService idService;

    public List<Character> getAllCharacter(){
        return repo.findAll();
    }

    public Character saveCharacter(CharacterDTO character) {
        Character characterWithID = new Character(idService.randomId(), character.name(),
                character.age(), character.profession());
        return repo.save(characterWithID);
    }

    public Character findById(String id) {
        return repo.findById(id).orElseThrow();
    }

    public Character changeCharacter(Character character, Character byId) {
        repo.deleteById(byId.id());
        return repo.save(character);
    }
    public Optional<Character> getCharacterFromQuery(int age, String profession){
        return repo.findCharacterByAgeAndProfession(age, profession);
    }

    public void deleteCharacterById(String id) {
        repo.deleteById(id);
    }

    public List<Character> getAllCharactersByAge(int age) {
        return repo.findCharactersByAge(age);
    }
}
