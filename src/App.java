// A program kiírással szimulál egy hálózathoz való csatlakozást, a Connectable interface segítségével. 
//Havel Janka
//2024-10-07
//SZOFT II/1/N

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Havel Janka, SZOFT II/1/N");

        Network network = new Network();
        network.connectToNetwork("Instagram");
        network.disconnectFromNetwork();
    }
}
