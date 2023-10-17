package sem1homework;
public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Tea", 200, 80);
        HotDrink coffee = new HotDrink("Coffee", 150, 90);
        
        HotDrinksMachine vendingMachine = new HotDrinksMachine();
        
        HotBeverage product1 = vendingMachine.getProduct("Tea", 200);
        System.out.println("Product 1: " + product1.getName() + ", " + product1.getVolume());
        
        HotDrink product2 = vendingMachine.getProduct("Coffee", 150, 95);
        System.out.println("Product 2: " + product2.getName() + ", " + product2.getVolume() + ", " + product2.getTemperature());
    }
}
