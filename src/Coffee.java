public class Coffee {
    String NameofDrink;
    int nSugarPackets;
    int cost;
    boolean hasWholeMilk;

    public Coffee(){

    }
    public void printInfo(){
        if (hasWholeMilk = true){
            System.out.println("This is a " + NameofDrink + " with whole milk and " + nSugarPackets + " sugar packets, it costs " + cost + " dollars." );
        }
        else {
            System.out.println("This is a " + NameofDrink + " with oat milk and " + nSugarPackets + " sugar packets, it costs " + cost + " dollars." );
        }
    }
}
