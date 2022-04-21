package racingcar.domainTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Cars;
import racingcar.domain.name.Names;

public class TestCars {

    Cars cars;

    @BeforeEach
    void setup() {
        cars = new Cars(new Names("하하1,하하2,하하3"));
    }

    @Test
    @DisplayName("자동차들은 하나 이상이여야 한다")
    void 자동차들은_하나_이상이여야_한다() {
        System.out.println("s = " + cars.toString());
    }
}
