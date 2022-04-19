package homeworks.inner;

import java.util.ArrayList;
import java.util.Date;


public class Catalog {
    protected ArrayList<Book> books = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder catalogLog = new StringBuilder();
        for (Book book : books) {
            catalogLog.append(book.name);
            catalogLog.append("\r\n");
            catalogLog.append(book.history);
        }
        return catalogLog.toString();
    }

    public static class Book {
        private String name;
        private String catalogID;
        private boolean isTaken;
        private StringBuilder history;

        public Book(String name, String catalogID) {
            this.name = name;
            this.catalogID = catalogID;
            isTaken = false;
            history = new StringBuilder();
        }
    }

    class TakeBook {
        public String takeBook(String readerId, String bookName) {
            for (Book currentBook : books) {
                if (currentBook.name.equals(bookName)) {
                    if (currentBook.isTaken) continue;
                    else {
                        currentBook.isTaken = true;
                        currentBook.history.append(readerId);
                        currentBook.history.append(" take ");
                        currentBook.history.append(new Date());
                        currentBook.history.append("\r\n");
                        return currentBook.catalogID;
                    }
                }
            }
            return "taken";
        }
    }

    class ReturnBook {
        public void turn(String readerId, String bookId) {
            for (Book currentBook : books) {
                if (currentBook.catalogID.equals(bookId)) {
                    if (currentBook.isTaken) {
                        currentBook.isTaken = false;
                        currentBook.history.append(readerId);
                        currentBook.history.append(" return ");
                        currentBook.history.append(new Date());
                        currentBook.history.append("\r\n");
                        return;
                    }
                    break;
                }
            }
        }
    }
}




