package ex1;

public class CarStore {

    private List<Car> cars = new List<>();
    private List<Car> foundCar = new List<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addAllCars(List<Car> cars) {
        cars.addAll(cars);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void addFoundCar() {

    }

    public List<Car> getFoundCars() {

    }


}
