package com.clientbase.events;

import com.cubk.event.Event;

public class EventRender2D extends Event {
    public float partialTicks;

    public EventRender2D(float partialTicks) {
        this.partialTicks = partialTicks;
    }

    public float getPartialTicks() {
        return partialTicks;
    }
}
