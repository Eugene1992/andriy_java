package homework.firstUncheked;

public class ExeptionIllegalArgument {
    int m;

    public static void main(String[] args) {
        ExeptionIllegalArgument s1 = new ExeptionIllegalArgument();
        s1.setMarks(105);
        System.out.println(s1.m);

    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100)
            throw new IllegalArgumentException(Integer.toString(marks));
        else
            m = marks;
    }
}
