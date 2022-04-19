package homeworks.homework.inner;

import java.util.ArrayList;

public class Park {
    protected ArrayList<Actraction> actractions = new ArrayList<>();

    enum Type {
        EXTREAM,
        LITE
    }

    public static class Actraction {
        private String name;
        private Type type;
        private boolean isAccess;
        private String time;
        private int money;

        public Actraction(String name, Type type, String time, int money) {
            this.name = name;
            this.type = type;
            this.time = time;
            this.money = money;
            isAccess = false;

        }
    }

    class Time {
        public void timeWork() {
            System.out.println("Monday-Friday 9:00 - 20:00");
            System.out.println("Saturday-Sunday 12:00 - 18:00");
        }
    }

    class Return {
        public void returnAtract() {
            for (Park.Actraction myAtract : actractions) {
                System.out.println(myAtract);
            }
        }
    }

    class Cost {
        public void moneyCost() {
            System.out.println("Extream - 500$");
            System.out.println("Lite - 200$");
        }
    }

    class Booking {
        public void buySession(int moneyHaveCustomer) {
            int lite = 0;
            int extream = 0;
            int surrender = 0;
            int moneyCustomer = moneyHaveCustomer;
            if (moneyHaveCustomer >= 300) {
                while (moneyHaveCustomer >= 300) {
                    Integer randomIndex = (int) (Math.random() * 2 + 1);
                    if (randomIndex.equals(1)) {
                        moneyHaveCustomer = moneyHaveCustomer - 300;
                        lite++;
                    } else if (randomIndex.equals(2) && moneyHaveCustomer >= 500) {
                        moneyHaveCustomer = moneyHaveCustomer - 500;
                        extream++;
                    } else if (randomIndex.equals(2)) {
                        continue;
                    }
                }
            } else {
                System.out.println("Not enough money");
            }
            surrender = moneyCustomer - (lite * 300 + extream * 500);
            System.out.println("You may select Lite" + " " + lite);
            System.out.println("And Extream" + " " + extream);
            System.out.println("Surrender" + " " + surrender);
        }
    }
}
