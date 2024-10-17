package lesson_26.GenericTarget;

public class BoxesApp {
    public static void main(String[] args) {
        String variable = "Hello";
        System.out.printf("Шаблон строки -> %s", variable);

        System.out.println("--------------------------String---------------------------");
        SuperBoxGen<String> box = new SuperBoxGen<>("Hello");
        System.out.println(box.toString());

        System.out.println("--------------------------Double---------------------------");
        SuperBoxGen<Double> doubleBox = new SuperBoxGen<>(500.556677);
        System.out.println(doubleBox.toString());

        System.out.println("---------------------Не указываем ПАРАМЕТР (тип данных)--------------------------------");
        //по умолчанию в < > подставляется Object
        SuperBoxGen boxObject = new SuperBoxGen<>("String");
        // в правой стороне мы можем при этом указать любой тип данных, но
        // у нас при этом с этим объектом будет ограниченный 11 методами класса Object
        // функционал
        System.out.println(boxObject.getValue()); //
        boxObject.setValue(1);

        // с объектами типа Object нельзя производить мат.операции
        // т.к. система не понимает какой там тип данных храниться
        // System.out.println(boxObject.getValue() + 5);

        // а с определёнными типами (Integer, Double, ...) можно производить мат. операции
        // и работать с широким функционалом этих классов-обёрток (Integer, Double, ...)
        System.out.println(doubleBox.getValue()+ doubleBox.getValue());

        // SuperBoxGen<Integer>





    }

}
