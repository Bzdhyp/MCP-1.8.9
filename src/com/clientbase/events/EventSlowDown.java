package com.clientbase.events;

import com.cubk.event.Event;

public class EventSlowDown extends Event {
    private float strafeMultiplier;
    private float forwardMultiplier;

    public EventSlowDown(float strafeMultiplier, float forwardMultiplier) {
        this.strafeMultiplier = strafeMultiplier;
        this.forwardMultiplier = forwardMultiplier;
    }

    public float getStrafeMultiplier() {
        return strafeMultiplier;
    }

    public float getForwardMultiplier() {
        return forwardMultiplier;
    }

    public void setStrafeMultiplier(float strafeMultiplier) {
        this.strafeMultiplier = strafeMultiplier;
    }

    public void setForwardMultiplier(float forwardMultiplier) {
        this.forwardMultiplier = forwardMultiplier;
    }
}
