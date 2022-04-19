package homeworks.homework.inner;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog();
        catalog.books.add(new Catalog.Book("Book1", "1"));
        catalog.books.add(new Catalog.Book("Book2", "2"));
        catalog.books.add(new Catalog.Book("Book3", "3"));
        System.out.println("What you wanna do?");
        System.out.println("1-Take book" + "2-Return book");
        String whatYouDo = scanner.nextLine();
        if (whatYouDo.equals("1")) {
            System.out.println("Write name of book");
            String bookName = scanner.nextLine();
            Catalog.TakeBook take = catalog.new TakeBook();
            take.takeBook("1", bookName);
            System.out.println(catalog);
        } else {
            Catalog.ReturnBook returnBook = catalog.new ReturnBook();
            returnBook.turn("0", "1");
            System.out.println(catalog);
        }

        Mobile mobile = new Mobile();
        System.out.println("What you wanna do?");
        System.out.println("1-Characterictik phone?" + "2-Model Phone" + "3-what cost");
        mobile.models.add(new Mobile.Model("Iphone", Mobile.Type.Flagman, 1200, 6000, 20));
        mobile.models.add(new Mobile.Model("Xiaomi", Mobile.Type.Budgetary, 200, 3000, 5));
        String whatYouWannaDo = scanner.nextLine();
        if (whatYouWannaDo.equals("1")) {
            System.out.println("Whrite what phone you wanna see");
            String modelPhone = scanner.nextLine();
            Mobile.Characteristic characteric = mobile.new Characteristic();
            characteric.characteristic(modelPhone);
        } else if (whatYouWannaDo.equals("2")) {
            Mobile.Info cost = mobile.new Info();
            cost.information();
        } else if (whatYouWannaDo.equals("3")) {
            Mobile.Cost cost = mobile.new Cost();
            cost.moneyCost();
        } else {
            System.out.println("Please correctly select number");
        }

        Park park = new Park();
        System.out.println("What you wanna do?");
        System.out.println("1-What the time you work?" + " " + "2-Access atraction" + " " + "3-what cost");
        System.out.println("4-Select and give your budget and we recomend you what atract select");
        String whatDo = scanner.nextLine();
        park.actractions.add(new Park.Actraction("Swings", Park.Type.LITE, "15 min", 300));
        park.actractions.add(new Park.Actraction("Roller coaster", Park.Type.EXTREAM, "10", 500));
        park.actractions.add(new Park.Actraction("Train", Park.Type.LITE, "12", 300));

        if (whatYouWannaDo.equals("1")) {
            Park.Time time = park.new Time();
            time.timeWork();
        } else if (whatYouWannaDo.equals("2")) {
            Park.Return returnAccess = park.new Return();
            returnAccess.returnAtract();
        } else if (whatYouWannaDo.equals("3")) {
            Park.Cost cost = park.new Cost();
            cost.moneyCost();
        } else if (whatYouWannaDo.equals("4")) {
            System.out.println("Write how much money you have");
            int moneyHaveCustomer = scanner.nextInt();
            Park.Booking booking = park.new Booking();
            booking.buySession(moneyHaveCustomer);
        } else {
            System.out.println("Write a correct wariable");
        }

    }
}

