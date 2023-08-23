package homework_3.task_car;

public class FutureCar extends Car {
    public FutureCar(String brand, String model, Color color, TypeCar bodyType, int amountWheels, TypeGearBox gearBoxType, double engineCapacity) {
        super(brand, model, color, bodyType, amountWheels, gearBoxType, engineCapacity);
    }

    @Override
    public void setAmountWheels(int amountWheels) {
        super.setAmountWheels(3);
    }

    private void fly() {
        // Реализация полёта
    }

    @Override
    public void movement() {
        // Переопределённая реализация движения
    }
}