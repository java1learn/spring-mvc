package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Audi","Quattro","white"));
        carList.add(new Car("BMW","M5","blue"));
        carList.add(new Car("Lamborghini","Diablo","yellow"));
        carList.add(new Car("Ferrari","Enco","red"));
        carList.add(new Car("Porsche","Boxster","grey"));

        return carList;
    }
}
