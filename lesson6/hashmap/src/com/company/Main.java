package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            Integer key = Integer.parseInt(scanner.nextLine());
            String value = scanner.nextLine();
            map.put(key, value);
        }

        Map<String, List<Integer>> result = new HashMap<>();
        for (Integer key: map.keySet()) {
            if(!result.containsKey(map.get(key))) {
                List<Integer> list = new ArrayList<>();
                list.add(key);
                result.put(map.get(key), list);
            } else {
                result.get(map.get(key)).add(key);
            }
        }

        for (String key: result.keySet()) {
            System.out.println("Key " + key + " list " + result.get(key));
        }

    }
}

/*

Hard: Напишите метод, который получает на вход Map<String, Integer> и возвращает Map, где ключи и значения поменяны местами.
Так как значения могут совпадать, то тип значения в Map будет уже не K, а
Collection<K>:

result Map<Integer, List<String>>

 */
