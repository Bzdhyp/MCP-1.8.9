package com.clientbase.events;

import com.cubk.event.Event;

public class EventJump extends Event {
    public float motion;
    public float yaw;

    public EventJump(float yaw, float motion) {
        this.yaw = yaw;
        this.motion = motion;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public float getMotion() {
        return motion;
    }

    public void setMotion(float motion) {
        this.motion = motion;
    }
}

