package app.books.legacy.filter;

import app.books.legacy.controller.Request;
import app.books.legacy.controller.Response;

public abstract class AbstractFilter {
    private AbstractFilter next;

    public void setNext(AbstractFilter next) {
        this.next = next;
    }

    protected Response next(Request request) {
        if (next == null) {
            return new Response(200, "OK");
        }
        return next.handle(request);
    }

    public abstract Response handle(Request request);
}
