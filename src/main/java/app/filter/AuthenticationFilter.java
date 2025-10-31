package app.filter;

import app.controller.Request;
import app.controller.Response;

public class AuthenticationFilter extends AbstractFilter {
    @Override
    public Response handle(Request request) {
        if (request.getPath().startsWith("/admin")) {
            System.out.println("[AUTH] Checking authentication for admin route...");
            System.out.println("[AUTH] Access denied.");
            return new Response(401, "Unauthorized");
        }
        return next(request);
    }
}
