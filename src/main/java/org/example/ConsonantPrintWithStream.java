package org.example;


import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsonantPrintWithStream {

    public static void main(String[] args) {
        String[] city = {"Mumbai","Delhi","Dubai","Meerut"};

        Arrays.stream(Arrays.toString(city)
                        .toLowerCase()
                        .split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(i-> !i.getKey().equals("a") && !i.getKey().equals("i") && !i.getKey().equals("e") && !i.getKey().equals("o") && !i.getKey().equals("u") && !i.getKey().equals(" ") && !i.getKey().equals(",") && !i.getKey().equals("[") && !i.getKey().equals("]"))
                .forEach(i-> System.out.println(i.getKey()+"->"+i.getValue()));
    }
}