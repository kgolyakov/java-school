package classwork.lab1;

import classwork.lab1.enums.HttpService;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HttpServiceTest {
    @Test
    public void handlesOneCode() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(115);
        assertLinesMatch(Arrays.stream(new String[]{"INFORMATION"}), out.toString().lines());
        System.setOut(save_out);
    }

    @Test
    public void handlesSeveralCodes() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(110);
        httpService.handleHttpCode(404);
        httpService.handleHttpCode(303);
        assertLinesMatch(Arrays.stream(new String[]{"INFORMATION", "CLIENT_ERROR", "REDIRECTION"}), out.toString().lines());
        System.setOut(save_out);
    }

    @Test
    public void borderValues() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(100);
        httpService.handleHttpCode(199);
        httpService.handleHttpCode(200);
        httpService.handleHttpCode(299);
        httpService.handleHttpCode(300);
        httpService.handleHttpCode(399);
        httpService.handleHttpCode(400);
        httpService.handleHttpCode(499);
        httpService.handleHttpCode(500);
        httpService.handleHttpCode(599);
        assertLinesMatch(Arrays.stream(new String[]{"INFORMATION",
                "INFORMATION",
                "SUCCESS",
                "SUCCESS",
                "REDIRECTION",
                "REDIRECTION",
                "CLIENT_ERROR",
                "CLIENT_ERROR",
                "SERVER_ERROR",
                "SERVER_ERROR",}), out.toString().lines());
        System.setOut(save_out);
    }

    @Test
    public void invalidCodes() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HttpService httpService = new HttpService();
        assertThrows(IllegalStateException.class, () -> httpService.handleHttpCode(600), "code 600 unknown");
        assertThrows(IllegalStateException.class, () -> httpService.handleHttpCode(99), "code 99 unknown");
        assertThrows(IllegalStateException.class, () -> httpService.handleHttpCode(0), "code 0 unknown");
        assertThrows(IllegalStateException.class, () -> httpService.handleHttpCode(-100), "code -100 unknown");
        System.setOut(save_out);
    }
}