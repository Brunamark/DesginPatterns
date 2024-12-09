package com.e.Business;

public class Ticket {

    private String description;
    private TicketComplexity ticketComplexity;
    private int priority;

    
    public Ticket(String description, TicketComplexity ticketComplexity, int priority) {
        this.description = description;
        this.ticketComplexity = ticketComplexity;
        this.priority = priority;
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
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    
}
