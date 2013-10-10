package ua.bychkovskyy.model;

import javax.servlet.AsyncContext;

public class AnonymousGameObserver implements GameObserver {
    private AsyncContext context;

    public AnonymousGameObserver(AsyncContext context) {
        this.context = context;
    }

    @Override
    public AsyncContext getAsyncContext() {
        return context;
    }
}
