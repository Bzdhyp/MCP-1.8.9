package com.clientbase.events;

import com.clientbase.util.player.MoveUtil;
import com.cubk.event.Event;

public class EventStrafe extends Event {
    public float strafe;
    public float forward;
    public float friction;
    public float yaw;

    public EventStrafe(float Strafe, float Forward, float Friction, float Yaw) {
        this.strafe = Strafe;
        this.forward = Forward;
        this.friction = Friction;
        this.yaw = Yaw;
    }

    public float getStrafe() {
        return strafe;
    }

    public float getForward() {
        return forward;
    }

    public float getFriction() {
        return friction;
    }

    public float getYaw() {
        return yaw;
    }

    public void setStrafe(float strafe) {
        this.strafe = strafe;
    }

    public void setForward(float forward) {
        this.forward = forward;
    }

    public void setFriction(float friction) {
        this.friction = friction;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public void setSpeed(final double speed) {
        setFriction((float) (getForward() != 0 && getStrafe() != 0 ? speed * 0.98F : speed));
        MoveUtil.stop();
    }
}
