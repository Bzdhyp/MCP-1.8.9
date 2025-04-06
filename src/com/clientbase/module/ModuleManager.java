package com.clientbase.module;

import com.clientbase.Wrapper;
import com.clientbase.events.EventKey;
import com.clientbase.module.impl.move.Sprint;
import com.cubk.event.EventTarget;
import org.lwjgl.input.Keyboard;

import java.lang.reflect.Field;
import java.util.*;

public class ModuleManager {
    private final Map<String, Module> moduleMap = new HashMap<>();

    public void init() {
        Wrapper.instance.getEventProtocol().register(this);

        // visual

        // move
        this.register(new Sprint("Sprint", Category.MOVEMENT));

        this.addValue();
    }

    public Map<String, Module> getModuleMap() {
        return moduleMap;
    }

    public boolean isEnabled(Class<? extends Module> c) {
        Module m = getModule(c);
        return m != null && m.isEnabled();
    }

    public <T extends Module> T getModule(Class<T> cls) {
        return cls.cast(moduleMap.get(cls.getSimpleName()));
    }

    public void addValue() {
        List<Map.Entry<String, Module>> entryList = new ArrayList<>(moduleMap.entrySet());
        entryList.sort(Comparator.comparing(entry -> entry.getValue().getName()));

        moduleMap.clear();
        for (Map.Entry<String, Module> entry : entryList) {
            moduleMap.put(entry.getKey(), entry.getValue());
        }
    }

    /**
     * Register module
     * @param module module
     */
    public void register(Module module) {
        for (final Field field : module.getClass().getDeclaredFields()) {
            field.setAccessible(true);
        }
        moduleMap.put(module.getClass().getSimpleName(), module);
    }

    /**
     * Event handler for key press events.
     * Toggles the corresponding module if its keybind matches the pressed key.
     * @param event The key press event.
     */
    @EventTarget
    private void onKey(EventKey event) {
        moduleMap.values().stream().filter(module -> module.getKey() ==
                event.getKey() && event.getKey() != -1).forEach(Module::toggle);
    }
}
