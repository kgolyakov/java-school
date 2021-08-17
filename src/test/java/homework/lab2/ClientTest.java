package homework.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void constructorCreates() {
        Client client = new Client.Constructor()
                .bonus(10)
                .debt(20)
                .name("Abacaba")
                .salary(30)
                .construct();
        assertEquals("Client(debt=20, bonus=10, name=Abacaba, salary=30)",
                client.toString(),
                "Created Client has same properties");
    }

    @Test
    public void anyOrderSuffices() {
        Client client = new Client.Constructor()
                .salary(30)
                .bonus(10)
                .name("Abacaba")
                .debt(20)
                .construct();
        assertEquals("Client(debt=20, bonus=10, name=Abacaba, salary=30)",
                client.toString(),
                "Created Client has same properties");
    }

    @Test
    public void multipleSetsSuffice() {
        Client client = new Client.Constructor()
                .salary(30)
                .name("Abadaba")
                .bonus(10)
                .bonus(20)
                .name("Abacaba")
                .debt(20)
                .construct();
        assertEquals("Client(debt=20, bonus=20, name=Abacaba, salary=30)",
                client.toString(),
                "Created Client has same properties");
    }
}