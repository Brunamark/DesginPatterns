package com.e.Business;

public class Ticket {

    private String description;
    private TicketComplexity ticketComplexity;

    
    public Ticket(String description, TicketComplexity ticketComplexity) {
        this.description = description;
        this.ticketComplexity = ticketComplexity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getTicketComplexity() {
        return ticketComplexity.getLevel();
    }
    public void setTicketComplexity(TicketComplexity ticketComplexity) {
        this.ticketComplexity = ticketComplexity;
    }

    
}
