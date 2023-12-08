package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constants.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomMove {

    List<Integer> randomMove;

    private RandomMove(int carNumber) {
        createRandomNumber(carNumber);
    }

    public static RandomMove createRandomMove(int carNumber) {
        return new RandomMove(carNumber);
    }

    public void createRandomNumber(int carNumber) {
        this.randomMove = new ArrayList<>();
        while(randomMove.size() < carNumber) {
            int randomNumber = Randoms.pickNumberInRange(Constants.MIN_RANDOM_NUM, Constants.MAX_RANDOM_NUM);
            if (randomNumber >= Constants.MOVE_THRESHOLD) { randomMove.add(Constants.MOVE); }
            if (randomNumber < Constants.MOVE_THRESHOLD) { randomMove.add(Constants.NON_MOVE); }
        }
    }

    public List<Integer> getRandomMove() {
        System.out.println(randomMove);
        return Collections.unmodifiableList(randomMove);
    }

}
