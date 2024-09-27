public class HomeWork_03 {
    public static void main(String[] args) {
        // 1-е задание
        int age = 39;
        System.out.println("My age: " + age);
        double milkPrice = 25.8; // если целое, можно использовать int?
        System.out.println("Price of milk: " + milkPrice + " UAH");
        String firstName = "Alla";
        System.out.println("My first name: " + firstName);
        System.out.println("========================================");

        // 2-е задание
        // (0+1+2+3)/4 = 6-4 -> 4 целое и 2 в остатке
        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;
        int var5 = (var1 + var2 + var3 + var4) / 4;
        System.out.println("Ср. арифм. (целое): " + var5);
        int var6 = (var1 + var2 + var3 + var4) % 4;
        System.out.println("Ср. арифм. (остаток после целого): " + var6);
        System.out.println("----------------------------------------");
        // аналог
        System.out.println("Ср. арифм. целое: " + ((var1 + var2 + var3 + var4) / 4));
        System.out.println("Ср. арифм. остаток после целого: " + ((var1 + var2 + var3 + var4) % 4));
        System.out.println("========================================");

        // 3-е задание
        int aItemPrice1 = 1000;
        int bItemPrice2 = 500;
        double discountPercent = 0.1;
        int totalPrice = aItemPrice1 + bItemPrice2;
        System.out.println("Total price of both items:" + totalPrice);
        double discountMoney = totalPrice * discountPercent;
        System.out.println("Discount of price in money:" + discountMoney);
        System.out.println("========================================");

        //4-е задание
        int temperatureDay1 = 18;
        int temperatureDay2 = 19;
        int temperatureDay3 = 20;
        int temperatureDay4 = 21;
        int temperatureDay5 = 21;
        int temperatureDay6 = 22;
        int temperatureDay7 = 23;
        int averageTemperature = (temperatureDay1 + temperatureDay2 + temperatureDay3 + temperatureDay4 + temperatureDay5 + temperatureDay6 + temperatureDay7) / 7;
        System.out.println("Average temperature for the week: " + averageTemperature);
        System.out.println("========================================");

        // 5-е задание
        //- при делении целого числа на 2 получаются целые числа:
        int integer1 = 4; // 4/2 -> 2
        System.out.println("Result of integers division: " + (integer1 / 2));
        System.out.println("Rest of integers division: " + (integer1 % 2));
        System.out.println("------------------------------------------");
        double integer11 = 4.0;
        System.out.println("Result of integers division: " + (integer11 / 2));
        System.out.println("------------------------------------------");
        //- при делении целого числа на 3 получаются дробные числа:
        int integer2 = 4; // 4/3 -> 1 и остаток 1 или 1.3333333333333333
        System.out.println("Result of integers division: " + (integer2 / 3));
        System.out.println("Rest of integers division: " + (integer2 % 3));
        System.out.println("------------------------------------------");
        double integer22 = 4;
        System.out.println("Result of integers division: " + (integer22 / 3));
        System.out.println("========================================");
    }
}