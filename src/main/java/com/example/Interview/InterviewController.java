package com.example.Interview;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InterviewController {
    @PostMapping("/array")
    public String excersice(@RequestBody Integer[] array) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] result = new int[1];
        List<Integer> miLista = Arrays.asList(array);
        miLista.forEach(key -> {
            if(!hash.containsKey(key))
                hash.put(key, 1);
            else
                hash.put(key, hash.get(key) + 1);
        });
        if(hash.containsValue(1)) {
            hash.forEach((key, value) -> {
                if(hash.get(key) == 1) {
                    result[0] = key;
                }
            });
        }
        return Arrays.toString(result);
    }
}
