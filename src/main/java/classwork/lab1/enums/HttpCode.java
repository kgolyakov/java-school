package classwork.lab1.enums;

public enum HttpCode {
    INFORMATION(100, 199),
    SUCCESS(200, 299),
    REDIRECTION(300, 399),
    CLIENT_ERROR(400, 499),
    SERVER_ERROR(500, 599);

    final int codeBegin, codeEnd;
    HttpCode(int codeBegin, int codeEnd) {
        this.codeBegin = codeBegin;
        this.codeEnd = codeEnd;
    }

    public static HttpCode findByStatusCode(int statusCode) {
        HttpCode[] statuses = HttpCode.values();
        for (HttpCode status: statuses) {
            if (status.codeBegin <= statusCode && status.codeEnd >= statusCode) {
                return status;
            }
        }
        throw new IllegalStateException("code " + statusCode + " unknown");
    }
}
