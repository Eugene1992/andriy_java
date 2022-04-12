package homeworks.homework.firstUncheked;

public class UnExeptionStackOverFlow {
    public static void recursivePrint(int num) {
        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {
        UnExeptionStackOverFlow.recursivePrint(1);
    }
}
