package homeworks.inner;

import java.util.ArrayList;

public class Mobile {
    protected ArrayList<Mobile.Model> models = new ArrayList<>();

    enum Type {
        Flagman,
        Budgetary
    }

    public static class Model {
        private String name;
        private Mobile.Type type;
        private int money;
        private int charge;
        private int operative;


        public Model(String name, Mobile.Type type, int money, int charge, int operative) {
            this.name = name;
            this.type = type;
            this.money = money;
            this.charge = charge;
            this.operative = operative;
        }

    }


    class Cost {
        public void moneyCost() {
            System.out.println("Flagman - 1200$");
            System.out.println("Budgetary - 200$");
        }
    }

    class Info {
        public void information() {
            for (Model model : models) {
                System.out.println(model.name);
            }
        }
    }

    class Characteristic {
        public void characteristic(String modelPhone) {
            for (Model model : models) {
                if (modelPhone.equals(model.name)) {
                    System.out.println(model.name);
                    System.out.println("battery" + " " + model.charge);
                    System.out.println("operarive" + " " + model.operative);
                    System.out.println("cost" + " " + model.money);
                }
            }
        }
    }
}

