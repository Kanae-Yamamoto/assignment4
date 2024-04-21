package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("mike","tama","tora","kuro");
        names.stream().filter(name -> name.startsWith("t")).forEach(System.out::println);
    }
}
