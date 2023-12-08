package racingcar.model;

import racingcar.InputValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarName {

    private List<String> carName;

    private CarName(String carName) {
        List<String> carNames = Arrays.asList(carName.split(","));
        InputValidator.validateCarNames(carNames);
        this.carName = carNames;
    }

    public static CarName createCarName(String carName) {
        return new CarName(carName);
    }

    public int getCarNumber() {
        return carName.size();
    }

    public String getEachCarName(int index) {
        return carName.get(index);
    }

}
