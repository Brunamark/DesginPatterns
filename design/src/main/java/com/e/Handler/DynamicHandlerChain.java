package com.e.Handler;


public class DynamicHandlerChain {
    
    private SupportHandler firstHandler;

    public void addHandler(SupportHandler handler) {
        if (firstHandler == null) {
            firstHandler = handler;
        } else {
            SupportHandler temp = firstHandler;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.setNext(handler);
        }
    }

    public void removeHandler(SupportHandler handler) {
        SupportHandler temp = firstHandler;
        if (temp == handler) {
            firstHandler = temp.next;
            return;
        }

        while (temp != null && temp.next != handler) {
            temp = temp.next;
        }

        if (temp != null) {
            temp.setNext(temp.next.next);
        }
    }

    public SupportHandler getFirstHandler() {
        return firstHandler;
    }
}
