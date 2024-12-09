package com.e.Handler;

import com.e.Business.Ticket;

public class EscalationHandler extends SupportHandler{
    
    public EscalationHandler(){
        this.level = Integer.MAX_VALUE;
    }


    @Override
    protected  void handleTicket(Ticket ticket, String message){
        System.out.println("Escalation Level Process: " + message);
    }
}
