package com.e.Handler;

import com.e.Business.Ticket;

public class FirstLevel extends SupportHandler{
    public FirstLevel(int level){
        this.level = level;
    }
    @Override
    protected  void handleTicket(Ticket ticket, String message){
        System.out.println("First Level Process: " + ticket.getDescription() + " " + message);
    }
}
