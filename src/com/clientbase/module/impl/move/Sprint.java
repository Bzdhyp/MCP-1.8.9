package com.clientbase.module.impl.move;

import com.clientbase.events.EventUpdate;
import com.clientbase.module.Category;
import com.clientbase.module.Module;
import com.cubk.event.EventTarget;

public class Sprint extends Module {
    public Sprint(String name, Category category) {
        super(name, category);
    }

    @Override
    public void onDisable() {
        mc.gameSettings.keyBindSprint.pressed = false;
        super.onDisable();
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        mc.gameSettings.keyBindSprint.pressed = true;
    }
}

