package racingcar.service;

import racingcar.model.CarName;
import racingcar.model.CarPosition;

import java.util.List;

public class OutputService {
    private OutputService() {}

    public static String createResult(CarName carName, CarPosition carPosition) {
        int carNumber = carName.getCarNumber();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<carNumber;i++) {
            sb.append(carName.getEachCarName(i)).append(" : ");
            sb.append("-".repeat(carPosition.getEachCarPosition(i)));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static String createWinnerResult(CarName carName, CarPosition carPosition) {
        StringBuilder sb = new StringBuilder();
        sb.append("최종 우승자 : ");
        List<String> winners = carName.getWinnersName(carPosition.getRaceWinner());

        sb.append(String.join(",",winners));

        return sb.toString();
    }


}
