package homeworks.homework.secound;

public class ExeptionIllegalArgument {
    int mark;

    public static void main(String[] args) {
        ExeptionIllegalArgument argument = new ExeptionIllegalArgument();
        argument.setMarks(105);
        System.out.println(argument.mark);

    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(Integer.toString(marks));
        } else {
            mark = marks;
        }
    }
}
