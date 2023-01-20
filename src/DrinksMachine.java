import java.util.Scanner;

enum DrinksMachine {
    COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA
}

class Drinks {
    static final int COFFEE_PRICE = 70;
    static final int TEA_PRICE = 55;
    static final int LEMONADE_PRICE = 45;
    static final int MOJITO_PRICE = 80;
    static final int MINERAL_WATER_PRICE = 18;
    static final int COCA_COLA_PRICE = 25;

    static int NumberOfDrinks = 0;
    static int TotalAmount = 0;


    public static void DrinkMake(DrinksMachine variant) {

        switch (variant) {
            case COFFEE -> System.out.println("Кава готується. Чи бажаєте ще щось з напоїв?");
            case TEA -> System.out.println("Чай готується. Чи бажаєте ще щось з напоїв?");
            case LEMONADE -> System.out.println("Лимонад готується. Чи бажаєте ще щось з напоїв?");
            case MOJITO -> System.out.println("Мохіто готується. Чи бажаєте ще щось з напоїв?");
            case MINERAL_WATER -> System.out.println("Мінеральна вода зараз буде подана. Чи бажаєте ще щось з напоїв?");
            case COCA_COLA -> System.out.println("Кока Кола зараз буде подана. Чи бажаєте ще щось з напоїв?");
            default -> System.out.println("Будь ласка, натисніть цифру від 1 до 7.");
        }
        NumberOfDrinks++;

    }

    public static void TotalAmount(DrinksMachine price) {

        switch (price) {
            case COFFEE -> TotalAmount += COFFEE_PRICE;
            case TEA -> TotalAmount += TEA_PRICE;
            case LEMONADE -> TotalAmount += LEMONADE_PRICE;
            case MOJITO -> TotalAmount += MOJITO_PRICE;
            case MINERAL_WATER -> TotalAmount += MINERAL_WATER_PRICE;
            case COCA_COLA -> TotalAmount += COCA_COLA_PRICE;
        }

    }

    public static void Total() {

        System.out.println("Усього напоїв: " + NumberOfDrinks + ".");
        System.out.println("Сума чеку: " + TotalAmount + " " + "грн.");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Виберіть напій:");
            System.out.println("1. Кава");
            System.out.println("2. Чай");
            System.out.println("3. Лимонад");
            System.out.println("4. Мохіто");
            System.out.println("5. Мінеральна вода");
            System.out.println("6. Кока кола");
            System.out.println("7. Розрахунок");

            int variant = scanner.nextInt();

            DrinksMachine drink;

            switch (variant) {
                case 1 -> drink = DrinksMachine.COFFEE;
                case 2 -> drink = DrinksMachine.TEA;
                case 3 -> drink = DrinksMachine.LEMONADE;
                case 4 -> drink = DrinksMachine.MOJITO;
                case 5 -> drink = DrinksMachine.MINERAL_WATER;
                case 6 -> drink = DrinksMachine.COCA_COLA;
                case 7 -> {
                    Drinks.Total();
                    return;
                }
                default -> {
                    System.out.println("Будь ласка, натисніть цифру від 1 до 7.");
                    continue;
                }
            }
            Drinks.DrinkMake(drink);
            Drinks.TotalAmount(drink);
        }
    }
}
