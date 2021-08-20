package classwork.lab2.radioalarm;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RadioAlarmTest {
    @Test
    public void executeMethod() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        assertLinesMatch(Arrays.stream(new String[]{"Executing method a()"}), out.toString().lines());
        System.setOut(save_out);
    }


    @Test
    public void executeAlarmMethod() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Alarm alarm = new RadioAlarm();
        alarm.c();
        assertLinesMatch(Arrays.stream(new String[]{"Executing method c()"}), out.toString().lines());
        System.setOut(save_out);
    }

    @Test
    public void executeRadioMethod() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Radio radio = new RadioAlarm();
        radio.a();
        assertLinesMatch(Arrays.stream(new String[]{"Executing method a()"}), out.toString().lines());
        System.setOut(save_out);
    }

    @Test
    public void executeMultipleMethods() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();
        assertLinesMatch(Arrays.stream(new String[]{"Executing method a()",
                "Executing method b()",
                "Executing method c()",
                "Executing method d()",}), out.toString().lines());
        System.setOut(save_out);
    }

}