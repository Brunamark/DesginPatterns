package com.e.Handler;

import com.e.Business.Ticket;

public class ThirdLevel extends SupportHandler {

    public ThirdLevel(){
        this.level = 3;
    }


     @Override
    protected  void handleTicket(Ticket ticket, String message){
        System.out.println("First Level Process: " + ticket.getDescription() + " "  + message);
    }
}
