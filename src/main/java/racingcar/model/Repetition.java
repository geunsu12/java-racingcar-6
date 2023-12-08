package racingcar.model;

import racingcar.InputValidator;

public class Repetition {
    int repetition;
    int nowRepetition;

    private Repetition (String repetition) {
        InputValidator.validateIsNumber(repetition);
        this.repetition = Integer.parseInt(repetition);
        nowRepetition = 0;
    }

    public static Repetition createRepetition(String repetition) {
        return new Repetition(repetition);
    }

    public Boolean repeatAvailable() {
        return nowRepetition < repetition;
    }

    public void increaseRepetition() { this.nowRepetition++; }

}
