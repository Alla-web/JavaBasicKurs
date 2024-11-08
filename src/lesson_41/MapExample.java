package lesson_41;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        System.out.println("-------------------Constructors-------------------------");
        //создаёт по умолчанию 16 корзин, коэф-т загрузки 0,75 (12 элементов)
        Map<String, Integer> test = new HashMap<>();

        //создаёт по умолчанию 32 корзин, коэф-т загрузки 0,75 (24 элемента)
        test = new HashMap<>(32);

        //создаёт по умолчанию 32 корзин, коэф-т загрузки 0,90 (29 элементов)
        test = new HashMap<>(32, 0.90f);

        // принимает другую мар путём копирования всех пар (ключ, значение)
        Map<String, Integer> otherMap = new HashMap<>();
        otherMap.put("Hello", 1);
        otherMap.put("World", 2);
        test = new HashMap<>(otherMap);
        System.out.println("test -> " + test);

        System.out.println("-----------------------------------------------------------");
        Map<Integer, String> okdTable = new HashMap<>(); //устаревшая, медленная  и не  используется

        //конструкторю Создаёт пустую карту(map) ёмкостью 16 корзин
        Map<Integer, String> map = new HashMap<>();

        System.out.println("-------------------Basic methods-------------------------");
        System.out.println("-------------------Получение значений по ключу-------------------------");
        System.out.println("------------------------put(K key, V value)-----------------------");
        //put(K key, V value) - добавляет значение и возвращает старое значение,
        // соответствующее ключу, если оно было - вернётся значение, если элемента с
        // таким ключём не было - вернётся null
        String oldValue = map.put(1, "Hello");
        System.out.println("oldValue -> " + oldValue);
        map.put(2, "World");
        map.put(3, "Java");

        map.put(4, "Python");
        System.out.println("map -> " + map);
        //вернёт null, т.к. в карте нет такого ключа и, соответственно, нет значения к этому ключу
        System.out.println("map.put(4, Python) -> " + map.put(4, "Python"));
        oldValue = map.put(4, "Orange");
        //вернется значение, которое было ранее присвоено 4 -> Python
        System.out.println("map.put(4, Orange) -> " + oldValue);
        System.out.println("map.put(4, Apple) -> " + map.put(4, "Apple"));
        System.out.println("map -> " + map);
        map.put(-1000, "Minus");

        System.out.println("------------------------putAll(K key, V value)-----------------------");
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(0, "Pythom");
        newMap.put(2, "New Value");
        System.out.println(newMap);

        //принимает карту
        map.putAll(newMap);
        System.out.println(map);

        System.out.println("------------------------containsKey(Object key)-----------------------");
        //boolean containsKey(Object key) - вернёт true, если карта содержит указанный ключ
        //boolean containsValue(Object value) - вернёт true, если карта содержит указанное значение

        System.out.println("map.containsKey(8) -> " + map.containsKey(8));
        System.out.println("map.containsKey(1) -> " + map.containsKey(1));

        System.out.println("map.containsValue(\"Java\") -> " + map.containsValue("Java"));
        System.out.println("map.containsValue(\"NoValue\") -> " + map.containsValue("NoValue"));

        System.out.println("------------------------get(Object key)-----------------------");
        //если нет такого ключа, возвращает null
        //если есть такой ключ, возвращает значение
        System.out.println(map);
        String value = map.get(3);
        System.out.println("map.get(3) -> " + value);
        System.out.println("map.get(100) -> " + map.get(100));

        System.out.println("------------------------getOrDefault(Object key)-----------------------");
        //взвращает значение по ключу, если ключа нет - вернут значение,
        // которе я ему сам задам, н-р DefaultValue
        value = map.getOrDefault(3, "DefaultValue"); //ключ есть - вернёт значение
        System.out.println("getOrDefault(3,\"DefaultValue\") -> " + value);
        value = map.getOrDefault(100, "DefaultValue"); //ключ есть - вернёт значение
        System.out.println("getOrDefault(100,\"DefaultValue\") -> " + value);

        System.out.println("------------------------keySet()-----------------------");
        //выдает перечень всех существующих в мапе ключей
        System.out.println(map.keySet());

        System.out.println("------------------------Удаление пары (ключ, значение) по ключу-----------------------");
        System.out.println("------------------------remove(Object key)-----------------------");
        //удаляет пару (ключ, значение), если такая пара была - удалит значение, если не было - null
        System.out.println("map -> " + map);
        System.out.println("map.remove(100) -> " + map.remove(100));
        System.out.println("map -> " + map);
        System.out.println("map.remove(4) -> " + map.remove(4));
        System.out.println("map -> " + map);


    }

}
