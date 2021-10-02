package com.unique.name;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        JsonNode foo = new ObjectMapper().readTree("{ \"key\": [ 1, true, \"foo\" ] }");
        System.out.println(foo);
    }
}
