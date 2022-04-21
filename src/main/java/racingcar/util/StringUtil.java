package racingcar.util;

public class StringUtil {

    public StringUtil() {
    }

    public  static boolean isBlank(String value) {
        if(value == null || value.isEmpty()) {
            return true;
        }
        return value.trim().isEmpty();
    }

    public static String[] splitText(String value) {
        if (isBlank(value) || !value.contains(",")) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        return value.replace(" ", "").split(",");
    }
}
