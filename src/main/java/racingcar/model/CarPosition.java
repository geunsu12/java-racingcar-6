package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarPosition {

    private List<Integer> carPosition;

    private CarPosition(int carNums) {
        this.carPosition = new ArrayList<>(Collections.nCopies(carNums,0));
    }

    public static CarPosition createCarPosition(int carNums) {
        return new CarPosition(carNums);
    }

    public void moveCarPosition(List<Integer> eachMoveResult) {
        for (int i=0;i<carPosition.size();i++) {
            carPosition.set(i,carPosition.get(i)+eachMoveResult.get(i));
        }
    }

    public int getEachCarPosition(int index) {
        return carPosition.get(index);
    }

    public List<Integer> getRaceWinner() {
        int maxValue = Collections.max(this.carPosition);
        List<Integer> winners = new ArrayList<>();

        for (int i=0;i<this.carPosition.size();i++) {
            if(this.carPosition.get(i).equals(maxValue)) {
                winners.add(i);
            };
        }

        return winners;
    }
}
