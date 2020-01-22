package edu.java.operation.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPITest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        List<Integer> list = map.entrySet().stream().filter(t -> "a".equals(t.getKey())).map(t -> t.getValue())
                .collect(Collectors.toList());
        System.out.println(list);
    }

}
