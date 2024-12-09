package com.e.Handler;

import com.e.Business.Ticket;

public class EscalationHandler extends SupportHandler{
    
    public EscalationHandler(int level){
        this.level = level;
    }


    @Override
    protected  void handleTicket(Ticket ticket, String message){
        System.out.println("Escalation Level Process: " + ticket.getDescription() + " " + message);
    }
}
