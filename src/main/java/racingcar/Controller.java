package racingcar;

import racingcar.model.CarName;
import racingcar.model.CarPosition;
import racingcar.model.RandomMove;
import racingcar.model.Repetition;
import racingcar.view.InputView;
import racingcar.view.Outputview;

public class Controller {

    private CarName carName;
    private CarPosition carPosition;
    private Repetition repetition;
    private int carNumber;

    private Controller() {}

    public static Controller createController() {
        return new Controller();
    }

    public void prepareEngine() {
        Outputview.printRequireCarNameMessage();
        this.carName = CarName.createCarName(InputView.readLine());
        this.carNumber = carName.getCarNumber();
        this.carPosition = CarPosition.createCarPosition(carNumber);

        Outputview.printRequireTimesMessage();
        this.repetition = Repetition.createRepetition(InputView.readLine());
    }

    public void runEngine() {
        Outputview.printResultMessage();

        while (repetition.repeatAvailable().equals(true)) {
            RandomMove randomMove = RandomMove.createRandomMove(carNumber);
            carPosition.moveCarPosition(randomMove.getRandomMove());
            Outputview.printRaceResult(carName, carPosition);
            repetition.increaseRepetition();
        }

        Outputview.printRaceWinner(carName,carPosition);

    }

}
