package sem1homework;

public class HotDrink extends HotBeverage {
    private int temperature;
    
    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    
    public int getTemperature() {
        return temperature;
    }
}
