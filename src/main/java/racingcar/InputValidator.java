package racingcar;

import racingcar.constants.Constants;

import java.util.List;

public class InputValidator {
    private InputValidator() {}

    public static void validateCarNames(List<String> carNames) throws IllegalArgumentException {
        for(int i=0;i< carNames.size();i++) {
            if(carNames.get(i).length() > Constants.MAX_NAME_LENGTH) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void validateIsNumber(String repetition) throws IllegalArgumentException {
        if(!repetition.matches("^[0-9]*$") || repetition.length() > 9) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
    }

}
