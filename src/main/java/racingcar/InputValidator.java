package racingcar;

import racingcar.constants.Constants;

import java.util.List;

public class InputValidator {
    private InputValidator() {}

    public static void validateCarNames(List<String> carNames) throws IllegalArgumentException {
        for(String eachName : carNames) {
            if(eachName.isEmpty() || eachName.length() > Constants.MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("이름의 길이를 확인해주세요.");
            }
        }
    }

    public static void validateIsNumber(String repetition) throws IllegalArgumentException {
        if(!repetition.matches("^[0-9]*$") || repetition.length() > 9) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
    }

}
