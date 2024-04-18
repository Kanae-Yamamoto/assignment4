package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("mike","tama","tora","kuro");
        List<String> result = names.stream().filter(name -> name.startsWith("t")).toList();
        System.out.println(result);
    }
}