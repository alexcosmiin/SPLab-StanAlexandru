package app.controller;

import app.filter.AbstractFilter;

public class RequestHandler {
    private AbstractFilter firstFilter;
    private AbstractFilter lastFilter;

    public void addFilter(AbstractFilter filter) {
        if (firstFilter == null) {
            firstFilter = filter;
            lastFilter = filter;
        } else {
            lastFilter.setNext(filter);
            lastFilter = filter;
        }
    }

    public Response handle(Request request) {
        if (firstFilter != null) {
            return firstFilter.handle(request);
        }
        return new Response(404, "No filter chain configured");
    }
}
