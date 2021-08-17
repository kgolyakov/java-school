package homework.lab2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(12, 14, "Vasya", 100);
        //todo this is ugly!!!! find solution for creating a client
        // with more readable way

        Client client1 = new Client.Constructor()
                .debt(12)
                .bonus(14)
                .name("Vasya")
                .salary(100)
                .construct();
        System.out.println(client.toString());
        System.out.println(client1.toString());
    }
}