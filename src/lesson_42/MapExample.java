package lesson_42;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("-------------------------created Map------------------------------");
        Map<Integer, String> mapColors = new HashMap<>();

        mapColors.put(1, "red");
        mapColors.put(16, "green");
        mapColors.put(5, "blue");

        //напечатали
        System.out.println("mapColors -> " + mapColors);

        System.out.println("--------------------------size()------------------------------");
        //смотрим размер мапы
        System.out.println("mapColors.size() -> " + mapColors.size());

        System.out.println("--------------------------containsKey()------------------------------");
        //смотри есть ли этот ключ в нашей мапе
        System.out.println("mapColors" + mapColors);
        System.out.println("mapColors.containsKey(32) -> " + mapColors.containsKey(32));

        System.out.println("--------------------------containsValue(V)------------------------------");
        //смотрим, есть ли такое значение в гашей мапе
        System.out.println("mapColors" + mapColors);
        System.out.println("mapColors.containsValue(\"blue\") -> " + mapColors.containsValue("blue"));

        System.out.println("--------------------------get(K)------------------------------");
        // получаем значение по ключу
        System.out.println("mapColors" + mapColors);
        String color = mapColors.get(16);
        System.out.println("(mapColors.get(color) -> " + mapColors.get(color));

        System.out.println("--------------------------remove(V)------------------------------");
        //удаляем
        System.out.println("mapColors" + mapColors);
        String deletedValue = mapColors.remove(100);
        System.out.println("mapColors.remove(100) -> " + deletedValue);

        deletedValue = mapColors.remove(5);
        System.out.println("mapColors.remove(5) -> " + deletedValue);
        System.out.println("mapColors -> " + mapColors);

        /*
        void clear() - очищает мапу
        mapColors.void clear()
        System.out.println("mapColors -> "+mapColors);
         */

        System.out.println("--------------------------isEmpty()------------------------------");
        // смотрим пустая ли мапа
        System.out.println("mapColors" + mapColors);
        System.out.println("mapColors.isEmpty() -> " + mapColors.isEmpty());

        mapColors.put(7, "yellow");
        mapColors.put(8, "white");
        mapColors.put(24, "white");
        System.out.println("mapColors -> " + mapColors);

        System.out.println("---------------------------values() --------------------------------");
        //Collection<V> values() - возвращает коллекцию из всех значений карты
        //Значения в карте могуь повторяться. Уразных ключей допускаются одинаковые значения
        System.out.println("mapColors" + mapColors);
        Collection<String> values = mapColors.values();
        System.out.println("values.size() -> " + values.size());
        System.out.println("Collection<String> values -> " + values);

        System.out.println("-------------------------keySet()------------------------------");
        Set<Integer> keysSet = mapColors.keySet();
        System.err.println("Set<Integer> keys -> " + keysSet);

        //перебираем все ключи в цикле и получаем все значения
        for (Integer element : keysSet) {
            System.out.println(element + ": " + mapColors.get(element) + ", ");
        }
        System.out.println();

        /*
        //пример с листами и циклом фор
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        for (int i = 0; i < integers.size(); i++) {
            Integer key = integers.get(i);
        }

        for (Integer element : integers) {
            Integer key = integers.get(element);
        }

         */

        //между keysSet и mapColors есть живая связь - удаляя ключ, одновременно
        // удаляется значение в мапе по этому ключу
        keysSet.remove(7);
        System.out.println("После удаления 7-го ключа:");
        System.out.println("keysSet -> " + keysSet);
        System.out.println("mapColors -> " + mapColors);

        //между values и mapColors такая же связь
        //т.е. удаление по ключу и по значению работает в обе стороны
        values.remove("red");
        System.out.println(values);
        System.out.println("mapColors -> " + mapColors);

        System.out.println("---------------------------replase()------------------------------");
        //Entry - представляет собой ту самую пару ключ-значение
        //у нас есть возможность получить сет этих вхождений

        //Map.Entry<K, V> - возвращает сэт вхождений всех пар ключ-значение
        /*
        getKey()
        getValue()
        setValue(V value)
         */
        //тоже живая связь с картой
        System.out.println("--------------------------------------------");
        Set<Map.Entry<Integer, String>> entrySet = mapColors.entrySet();
        System.out.println("entrySet -> " + entrySet);
        System.out.println("--------------------------------------------");

        for (Map.Entry<Integer, String> entry : mapColors.entrySet()) {
            System.out.print("entry.getKey(): " + entry.getKey());
            System.out.print(" -> ");
            System.out.println("entry.getValue() -> " + entry.getValue());
            if (entry.getKey().equals(8)) {
                entry.setValue("JAVA!");
            }
        }

        System.out.println("-------------------------отличия put() и replace()--------------------------");
        System.out.println("-------------------------put()--------------------------");
        System.out.println(mapColors);
        //если такой ключ уже есть, значение перезапишется и вернётся старое значение
        //если такого ключа нет, значение установится и вернётся null
        mapColors.put(10, "red");
        System.out.println(mapColors);

        System.out.println("-------------------------replace()--------------------------");
        //если такой ключ уже есть, значение перезапишется и вернёт старое значение
        //если такого ключа нет, значение НЕ перезапишется и вернёт null
        mapColors.replace(11, "blue");
        System.out.println(mapColors);

        System.out.println("-------------------forEach() - для каждого------------------");
        //перебор всех пар ключ-значение
        mapColors.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        mapColors.forEach((k,v) -> {
            System.out.println("Iteration:");
            System.out.println("k: " + k + ", value: " + v);
            System.out.println("--------------------------");

        }
    );


    }
}
