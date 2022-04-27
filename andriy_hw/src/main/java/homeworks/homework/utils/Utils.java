package homeworks.homework.utils;

public final class Utils {

    private Utils() {
    }

    public static Integer getRandomIntByRange(int from, int to) {
        return (Integer) (int) (Math.random() * to + from);
    }
}