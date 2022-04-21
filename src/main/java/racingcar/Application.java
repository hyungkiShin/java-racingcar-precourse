package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        int randomInput = Randoms.pickNumberInRange(1, 9);
        final int integer = Integer.parseInt(Console.readLine());
    }
}
