package com.example.ffm232asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/asterix/characters")
public class CharacterController {

    private final CharacterService service;

    @GetMapping
    public List<Character> getAllCharacter(){
        return service.getAllCharacter();
    }
    @PostMapping
    public Character saveCharacter(@RequestBody Character character){
        return service.saveCharacter(character);
    }
    @GetMapping("/{id}")
    public Character getById(@PathVariable String id){
        return service.findById(id);
    }

}
