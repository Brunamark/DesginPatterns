package com.e.Handler;

import com.e.Business.Ticket;

public abstract class SupportHandler {
    
    protected SupportHandler next;

    protected int level;

    private Ticket ticket;

    private int passCount = 0;

  
    public void setNext(SupportHandler next) {
        this.next = next;
    }


    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    public void supporting(int level, String message, int priority){
        if(this.level >= level  || priority > this.ticket.getPriority()){
            handleTicket(this.ticket,message);
            passCount++;
        }
        if(next != null){
            next.supporting(level, message, priority);
        }
    }

    protected abstract void handleTicket(Ticket ticket, String message);

    public int getPassCount() {
        return passCount;
    }
}
