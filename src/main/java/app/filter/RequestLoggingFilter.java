package app.filter;

import app.controller.Request;
import app.controller.Response;

public class RequestLoggingFilter extends AbstractFilter {

    public void logRequest(String message) {
        System.out.println("[LOG] Incoming request: " + message);
    }

    public void logResponse(String message) {
        System.out.println("[LOG] Outgoing response: " + message);
    }

    @Override
    public Response handle(Request request) {
        System.out.println("[LOG] Request received: " + request.getMethod() + " " + request.getPath());
        Response response = next(request);
        System.out.println("[LOG] Response sent: " + response.getStatusCode() + " " + response.getMessage());
        return response;
    }
}
