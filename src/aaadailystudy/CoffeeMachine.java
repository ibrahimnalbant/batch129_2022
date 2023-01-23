package aaadailystudy;

class CoffeeMachine {
    int water;
    int coffeeBeans;
    int cups;
    int money;

    void addWater(int addedWater) {
        water += addedWater;
    }

    void addCoffeeBeans(int addedBeans) {
        coffeeBeans += addedBeans;
    }

    void addCups(int addedCups) {
        cups += addedCups;
    }

    void insertMoney(int addedMoney) {
        money += addedMoney;
    }

    void makeEspresso() {
        if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
            System.out.println("Making espresso...");
            water -= 250;
            coffeeBeans -= 16;
            cups -= 1;
            money += 4;
        } else {
            System.out.println("Unable to make espresso. Check water, beans, and cup levels.");
        }
    }

    void makeLatte() {
        if (water >= 350 && coffeeBeans >= 20 && cups >= 1) {
            System.out.println("Making latte...");
            water -= 350;
            coffeeBeans -= 20;
            cups -= 1;
            money += 7;
        } else {
            System.out.println("Unable to make latte. Check water, beans, and cup levels.");
        }
    }

    void makeCappuccino() {
        if (water >= 200 && coffeeBeans >= 12 && cups >= 1) {
            System.out.println("Making cappuccino...");
            water -= 200;
            coffeeBeans -= 12;
            cups -= 1;
            money += 6;
        } else {
            System.out.println("Unable to make cappuccino. Check water, beans, and cup levels.");
        }
    }

    void checkSupplies() {
        System.out.println("Water: " + water);
        System.out.println("Coffee Beans: " + coffeeBeans);
        System.out.println("Cups: " + cups);
        System.out.println("Money: " + money);
    }

    public static void main(String[] args) {
        CoffeeMachine myMachine = new CoffeeMachine();
        myMachine.addWater(1000);
        myMachine.addCoffeeBeans(100);
        myMachine.addCups(10);
        myMachine.insertMoney(50);
        myMachine.makeEspresso();
        myMachine.checkSupplies();
    }
}
