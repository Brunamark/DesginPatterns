package com.e.Handler;

import com.e.Business.Ticket;

public abstract class SupportHandler {
    
    protected SupportHandler next;

    protected int level;

    private Ticket ticket;

  
    public void setNext(SupportHandler next) {
        this.next = next;
    }


    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    public void supporting(int level, String message){
        if(this.level >= level){
            handleTicket(this.ticket,message);
        }
        if(next != null){
            next.supporting(level, message);
        }
    }

    protected abstract void handleTicket(Ticket ticket, String message);
}
