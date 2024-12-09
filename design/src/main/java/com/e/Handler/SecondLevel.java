package com.e.Handler;

import com.e.Business.Ticket;

public class SecondLevel extends SupportHandler{
    public SecondLevel(){
        this.level = 2;
    }


      @Override
    protected  void handleTicket(Ticket ticket, String message){
        System.out.println("First Level Process: " + ticket.getDescription() + " "  + message);
    }
}
