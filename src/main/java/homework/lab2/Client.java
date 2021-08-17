package homework.lab2;

import lombok.ToString;

@ToString
public class Client {
    private final int debt; //todo you can't remove final
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(int debt, int bonus, String name, int salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }

    public static class Constructor {
        private int debt;
        private int bonus;
        private String name;
        private int salary;

        public Constructor debt(int debt) {
            this.debt = debt;
            return this;
        }

        public Constructor bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Constructor name(String name) {
            this.name = name;
            return this;
        }

        public Constructor salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client construct() {
            return new Client(debt, bonus, name, salary);
        }

    }
}