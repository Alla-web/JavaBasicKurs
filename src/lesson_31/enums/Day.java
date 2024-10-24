package lesson_31.enums;

public enum Day {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESSDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7); // точка с запятой

    private String russian;
    private int dayOfWeek;

    //конструктор
    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        this.dayOfWeek = dayOfWeek;
    }

    //перегруженный констурктор
    Day(String russian) {
        this.russian = russian;
        this.dayOfWeek = 7;
    }

    //геттеры
    public String getRussian() {
        return russian;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    //сэттеры
    public void setRussian(String russian) {
        this.russian = russian;
    }

    //methods
    public String testMethod(){
        return String.format("%s - русский перевод: %s; номер дня недели: %d", this.name(), this.russian, this.dayOfWeek);
    }
}
