package ua.bychkovskyy.model;

import javax.servlet.AsyncContext;

public interface GameObserver {
    AsyncContext getAsyncContext();
}
