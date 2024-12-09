/*
 * Design a support ticket handling system that routes customer support tickets through different
 * levels of support based on their complexity.
 * 
 * Scenario: A customer support center needs a flexible system to process support tickets. The
 * support process should work as follows:
 * 
 * Tickets have different complexity levels: Low, Medium, and High Each support level should have
 * specific capabilities for handling tickets If a support level cannot handle a ticket, it should
 * pass the ticket to the next level There should be a final escalation point for unresolvable
 * tickets
 * 
 * Requirements: Implement at least three concrete support handler classes:
 * 
 * First Level Support (handles low complexity tickets) Second Level Support (handles medium
 * complexity tickets) Third Level Support (handles high complexity tickets)
 * 
 * 
 * Implement an escalation handler for tickets that cannot be resolved Design a mechanism to chain
 * these support handlers together Create a demonstration that shows:
 * 
 * Routing of different ticket types through the support chain Successful resolution of tickets at
 * appropriate support levels Escalation of tickets that cannot be resolved
 * 
 * Add a logging mechanism to track ticket movement through the support chain Implement a way to
 * track how many times a ticket has been passed between handlers Create a method to dynamically add
 * or remove handlers from the chain Add a priority system that can override the difficulty-based
 * routing
 */

 package com.e;

 import com.e.Business.Ticket;
 import com.e.Business.TicketComplexity;
 import com.e.Handler.EscalationHandler;
 import com.e.Handler.FirstLevel;
 import com.e.Handler.SecondLevel;
 import com.e.Handler.SupportHandler;
 import com.e.Handler.ThirdLevel;
 
 public class Main {
 
     public static SupportHandler getCadeia(Ticket ticket1, Ticket ticket2, Ticket ticket3) {
        
         SupportHandler firstHandler = new FirstLevel();
         firstHandler.setTicket(ticket1); 
         SupportHandler secondHandler = new SecondLevel();
         secondHandler.setTicket(ticket2); 
         SupportHandler thirdHandler = new ThirdLevel();
         thirdHandler.setTicket(ticket3); 
         SupportHandler escalationHandler = new EscalationHandler();
         escalationHandler.setTicket(ticket3); 
 
         firstHandler.setNext(secondHandler);
         secondHandler.setNext(thirdHandler);
         thirdHandler.setNext(escalationHandler);
 
         return firstHandler;
     }
 
     public static void main(String[] args) {
         Ticket ticket1 = new Ticket("Low complexity ticket", TicketComplexity.LOW,1);
         Ticket ticket2 = new Ticket("Medium complexity ticket", TicketComplexity.MEDIUM,3);
         Ticket ticket3 = new Ticket("High complexity ticket", TicketComplexity.HIGH,2);
 
         SupportHandler supportHandler = getCadeia(ticket1, ticket2, ticket3);
 
         System.out.println("Routing tickets through the support chain...\n");
 
         supportHandler.supporting(ticket1.getTicketComplexity(), "Need support on low complexity ticket",1);
         
         supportHandler.supporting(ticket2.getTicketComplexity(), "Need support on medium complexity ticket",3);
         
         supportHandler.supporting(ticket3.getTicketComplexity(), "Need support on high complexity ticket",2);
     }
 }
 