package classwork.lab1.enums;

public class HttpService {

    public void handleHttpCode(int httpCode) {
        System.out.println(HttpCode.findByStatusCode(httpCode));
    }

}
