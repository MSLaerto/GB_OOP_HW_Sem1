package sem1homework;

public interface VendingMachine {
    public HotBeverage getProduct(String name, int volume);
    public HotDrink getProduct(String name, int volume, int temperature);
}
