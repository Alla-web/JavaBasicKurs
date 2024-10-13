package lesson_21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Autobus {
    /*
    Для создания связи типа HAS-A мы определяем поле класса,
    которое будет хранить ссылку на объект другого класса
     */
    /*
    АССОЦИАЦИЯ, в т.ч. АГРЕГАЦИЯ и КОМПОЗИЦИЯ реализуются через создание ссылок
    на другие объекты внутри классы. Это отношение, где один класс использует
    другой в качестве одного из своих полей.

    АГРЕГАЦИЯ Autobus и BusDriver: Autobus содержит BusDriver, но BusDriver может
    существовать независимо от автобуса (он может пересесть в другой автобус или остаться дома)

    КОМПОЗИЦИЯ между Autobus Autopilot: Autopilot является неотъемлемой частью Autobus и не
    может существовать без Autobus

    Важные аспекты АССОЦИАЦИИ:
    - направленность связей - однонаправленная (один класс знает о втором, а второй о первом нет)
      и двунаправленная связь (оба класса знают друг о друге). Двунаправленные связи бывают редко и
      во второй класс добавляется ссылка на первый класс
    - кардинальность связи - определяет сколько объектов одного класса может быть ассоциировано
      с объектами другого класса:
        one to one - автобус и двигатель: каждый автобус может иметь ровно один двигатель и
                    и каждый двигатель приходится на один автобус
        one to many - автобус и список пассажиров: один автобус может перевозить множество пассажиров
        many to many - список автобусов и список автобусных остановок: каждый автобус останавливается
                    на множестве остановок и с др. стороны: каждая остановка может обслуживать множество
                    остановок
    */
    //-------------------------------------------------------------------------------------
    private BusDriver driver; // связь в форме АГРЕГАЦИИ - "мягкая" связь - водители могут пересаживаться п оавтобусам
    private AutoPilot autopilot; // связь в формате КОМПОЗИЦИЯ - "жёсткая" неразрывная связь
    //-------------------------------------------------------------------------------------

    // уникальный идентификатор нашего объекта (номер или строка)
    private static int counter = 1;

    private final int id;

    private final int capacity;
    private int countPassengers;

    //-------------------------------------------------------------------------------------
    private final Passenger[] passengers; // связь в форме АГРЕГАЦИИ - "мягкая" связь
    //-------------------------------------------------------------------------------------

    // constructor
    // пришла ссылка из вне -  private BusDriver driver; добавляем в конструктор переменную BusDriver busdriver
    // autopilot  - создаем внутри конструктора
    public Autobus(BusDriver busdriver, int capacity) {
        this.id = counter; // при создании объекта мы возьмём тек. значение каунтера
        counter++; // и одновременно увеличим тек.знач.каунтера на 1
        //this.id = counter++; - в одну строку
        this.capacity = capacity;

        this.driver = busdriver; // (принимаемое значение) связь в форме АГРЕГАЦИИ - "мягкая" связь

        // связь в формате КОМПОЗИЦИЯ - "жёсткая" неразрывная связь
        this.autopilot = new AutoPilot("AP-v001");

        // реализуем двунаправленность связи
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity]; // связываем с классом пассажиров
    }

    // getters
    public BusDriver getDriver() {
        return driver;
    }

    public AutoPilot getAutopilot() {
        return autopilot;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    //setters
    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    // methods
    public String toString() {
        return "Autobus: {id: " + id + ", capacity: " + capacity +
                "; driver: " + driver.toString() +
                "; autopilot " + autopilot.toString() +
                "}";
    }

    public void installNewPilot(String softwareVersion) {
        // следим за правильностью ссылок с обоих сторон двунаправленной связи
        this.autopilot.setAutobus(null);
        this.autopilot = new AutoPilot("softwareVersion");
        this.autopilot.setAutobus(this);
    }

    public void updateAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void showListOfPassenger() {
        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? " | " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) {
            System.out.println("Не удалось посадить пассажира");
            return false;
        }
       /*  - надо проверить:
            1) свободное место есть ли
            2) находится ли уже в нашем автобусе этот пассажир
            3) если есть место и пассажир ещё не в автобусе - садим на борт -
                 добавляем его в список пассажировб увеличиваем количество пассажиров в авобусе
                 и возвращаем true
            4) если нет места в автобусе - сообщаем об ршибке и возвращаем false

        */
        // 1. Место есть
        if (countPassengers < capacity) {
            System.out.printf("В автобусе id %d есть свободные места\n", this.id);

            // 2. Проверяем, есть ли такой пассажир в автобусе
            // путем использования ранее созданного метода
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир id %d уже сидит в автобус с id %d\n", passenger.getId(), this.id);
                return true;
            }
            // садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;
        }

        // свободного места нет
        System.out.printf("В автобусе id %d свободных мест нет!\n", this.id);
        return false;
    }

    // проверяем пассажиров по его id
    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        // пассажира с таким id нет в нашем массиве пассажиров
        return false;
    }


}
