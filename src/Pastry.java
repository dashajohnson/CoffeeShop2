public class Pastry {
    String NameofPastry;
    boolean isitSweet;
    int cost;

    public Pastry(){

    }
    public void printInfo(){
        if (isitSweet = true){
            System.out.println("This is a " + NameofPastry + " that is sweet and costs " + cost + " dollars.");
        }
        else {
            System.out.println("This is a " + NameofPastry + " that is savory and costs " + cost + " dollars.");
        }
    }
}
