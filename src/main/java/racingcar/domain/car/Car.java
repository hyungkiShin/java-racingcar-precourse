package racingcar.domain.car;

import racingcar.domain.name.Name;

public class Car {

    /* 이름 */
    private final Name name;

    /* 위치 */
    private final int position;

    public Car(Name name) {
        this(name, 0);
    }

    public Car(final Name name, final int position) {
        this.name = name;
        this.position = position;
    }

    public Name getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }
}
