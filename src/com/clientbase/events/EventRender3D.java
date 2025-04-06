package com.clientbase.events;

import com.cubk.event.Event;

public class EventRender3D extends Event {
    private float ticks;

    public EventRender3D(float ticks) {
        this.ticks = ticks;
    }

    public float getTicks() {
        return ticks;
    }

    public void setTicks(float ticks) {
        this.ticks = ticks;
    }
}
