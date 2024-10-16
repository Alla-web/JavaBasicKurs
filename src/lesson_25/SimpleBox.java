package lesson_25;

public class SimpleBox {
    private Object value; // в тип данных Object можно добавить все типы данных

    // constructor
    public SimpleBox(Object value) {
        this.value = value;
    }

    //getter
    public Object getValue() {
        return value;
    }

    //setter
    public void setValue(Object value) {
        this.value = value;
    }

  public String  toString (){
        return "SimpleBox{" +
                "value: " + value +
                "}";
  }
}
