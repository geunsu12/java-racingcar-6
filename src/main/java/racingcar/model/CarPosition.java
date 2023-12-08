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

    public Integer getEachCarPosition(int index) {
        return carPosition.get(index);
    }
}
