package lesson_41.homeWork_41;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    /*
    Пересечение двух карт: Реализуйте метод, который принимает две карты Map<String, Integer>
    и возвращает новую карту, содержащую только те записи, ключи которых присутствуют
    в обеих исходных картах. Для совпадающих ключей значение можно брать из любой карты
    */
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }//main

    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        //создаём мапу для записи результата
        Map<String, Integer> intersectionKeys = new HashMap<>();

        Set<String> keySet1 = map1.keySet();
        Set<String> keySet2 = map2.keySet();

        // проходимся по всем парам мапы 1, проверяем на совпадение пар,
        // если есть совпадения, записываем их в резулььтирующуй мапу intersectionKeys
        for (String key : keySet2) {
            if(keySet1.contains(key)){
                intersectionKeys.put(key, map1.get(key));
            }
        }
        return intersectionKeys;
    }
}//class
