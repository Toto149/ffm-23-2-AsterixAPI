package com.example.ffm232asterixapi;

import java.util.UUID;

public class IdService {

    public String randomId(){
        return UUID.randomUUID().toString();
    }
}
