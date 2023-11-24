package com.example.ffm232asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/asterix/characters")
public class CharacterController {

    private final CharacterService service;

    @GetMapping
    public List<Character> getAllCharacter(){
        return service.getAllCharacter();
    }
    @GetMapping
    public List<Character> getAllCharactersByAge(@RequestParam int age){
        return service.getAllCharactersByAge(age);
    }
    @GetMapping
    public Optional<Character> getCharacterFromQuery(@RequestParam int age, @RequestParam String profession){
        return service.getCharacterFromQuery(age, profession);
    }
    @PostMapping
    public Character saveCharacter(@RequestBody CharacterDTO character){
        return service.saveCharacter(character);
    }
    @GetMapping("/{id}")
    public Character getById(@PathVariable String id){
        return service.findById(id);
    }
    @PutMapping("/{id}")
    public Character changeCharacter(@RequestBody Character character,@PathVariable String id){
        return service.changeCharacter(character,getById(id));
    }
    @DeleteMapping("/{id}")
    public void deleteCharacterById(@PathVariable String id){
        service.deleteCharacterById(id);
    }

}
