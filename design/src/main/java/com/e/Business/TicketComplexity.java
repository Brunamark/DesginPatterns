package com.e.Business;

public enum TicketComplexity {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int level;

    TicketComplexity(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
