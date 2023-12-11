package racingcar.model;

import racingcar.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarName {

    private List<String> carNames;

    private CarName(String carName) {
        List<String> carNames = Arrays.stream(carName.split(","))
                .map(String::strip).collect(Collectors.toList());
        InputValidator.validateCarNames(carNames);
        this.carNames = carNames;
    }

    public static CarName createCarName(String carName) {
        return new CarName(carName);
    }

    public int getCarNumber() {
        return carNames.size();
    }

    public String getEachCarName(int index) {
        return carNames.get(index);
    }

    public List<String> getWinnersName (List<Integer> winners) {
        return winners.stream().map(i -> this.carNames.get(i)).collect(Collectors.toList());
    }

}
