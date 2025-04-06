package com.clientbase.events;


import com.cubk.event.Event;

public class EventSafeWalk extends Event {
    private boolean safe;

    public boolean isSafe() {
        return this.safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }
}
