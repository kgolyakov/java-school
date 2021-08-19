package classwork.lab1;

public class HttpService {

    public void handleHttpCode(int httpCode) {
        System.out.println(HttpCode.findByStatusCode(httpCode));
    }

}
