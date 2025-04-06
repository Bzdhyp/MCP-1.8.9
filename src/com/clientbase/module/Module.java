package com.clientbase.module;

import com.clientbase.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class Module {
    protected static final Minecraft mc = Minecraft.getMinecraft();

    private final String name;
    private final Category category;
    private String suffix = "";
    private boolean enabled;
    private boolean hidden;
    public int key = -1;

    public Module(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    /** Method called when the module is enabled. */
    public void onEnable() {
        // Module-specific implementation
    }

    /** Method called when the module is disabled. */
    public void onDisable() {
        // Module-specific implementation
    }

    /**
     * Toggles the module's enabled state.
     */
    public void toggle() {
        setEnabled(!isEnabled());
    }

    /**
     * Sets the module's enabled state.
     * @param enabled true to enable, false to disable.
     */
    public void setEnabled(boolean enabled) {
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (enabled) {
                enable();
            } else {
                disable();
            }
        }
    }

    /**
     * Enables the module.
     */
    private void enable() {
        Wrapper.instance.getEventProtocol().register(this);
        try {
            onEnable();
            playClickSound(1.0F);
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    /**
     * Disables the module.
     */
    private void disable() {
        Wrapper.instance.getEventProtocol().unregister(this);
        try {
            onDisable();
            playClickSound(0.8F);
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    /**
     * Plays the click sound.
     *
     * @param volume The volume of the sound.
     */
    private void playClickSound(float volume) {
        if (mc.thePlayer != null) {
            mc.getSoundHandler().playSound(PositionedSoundRecord.create(new ResourceLocation("random.click"), volume));
        }
    }

    public boolean isHidden() {
        return hidden;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Category getCategory() {
        return category;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
