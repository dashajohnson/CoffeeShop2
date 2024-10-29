public class CoffeeShop {

    String location;
    int sqft;
    boolean isOpen;

    public static void main(String[] args) {
        CoffeeShop myStore;
        myStore = new CoffeeShop();
        myStore.location = "Milton Academy";
        myStore.sqft = 500;
        myStore.isOpen = true;

        System.out.println("My "+myStore.sqft+"sqft coffee shop is in "+myStore.location);
    }

    public CoffeeShop(){

    Coffee Coffee1;
    Coffee1 = new Coffee();
    Coffee1.NameofDrink = "shaken espresso latte";
    Coffee1.nSugarPackets = 2;
    Coffee1.cost = 5;
    Coffee1.hasWholeMilk = true;
    Coffee1.printInfo();

    Pastry Pastry1;
    Pastry1 = new Pastry();
    Pastry1.NameofPastry = "raspberry danish";
    Pastry1.isitSweet = true;
    Pastry1.cost = 3;
    Pastry1.printInfo();
    }
}
