package homeworks.homework;

import java.util.Date;

//завдання 4
public class MyExeption extends Exception {
    String message;
    private Date timestamp = new Date();

    public MyExeption(String message, Date timestamp) {
        super(message);
        this.timestamp = timestamp;
    }
}
