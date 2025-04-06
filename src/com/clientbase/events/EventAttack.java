package com.clientbase.events;

import com.cubk.event.Event;
import net.minecraft.entity.Entity;

public class EventAttack extends Event {
    private final boolean pre;
    private Entity target;

    public EventAttack(Entity entity, boolean pre) {
        this.target = entity;
        this.pre = pre;
    }

    public Entity getTarget() {
        return target;
    }

    public void setTarget(Entity target) {
        this.target = target;
    }

    public boolean isPre() {
        return pre;
    }

    public boolean isPost() {
        return !pre;
    }
}
