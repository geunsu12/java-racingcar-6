package racingcar.view;

import racingcar.model.CarName;
import racingcar.model.CarPosition;
import racingcar.service.OutputService;

public class Outputview {

    private Outputview() {}

    public static void printRequireCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printRequireTimesMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printRaceResult(CarName carName, CarPosition carPosition) {
        System.out.println(OutputService.createResult(carName, carPosition));
    }

}
