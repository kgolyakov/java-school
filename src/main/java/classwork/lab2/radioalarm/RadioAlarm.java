package classwork.lab2.radioalarm;

public class RadioAlarm implements Alarm, Radio{
    @Override
    public void c() {
        System.out.println("Executing method c()");
    }

    @Override
    public void d() {
        System.out.println("Executing method d()");
    }

    @Override
    public void a() {
        System.out.println("Executing method a()");
    }

    @Override
    public void b() {
        System.out.println("Executing method b()");
    }
}
