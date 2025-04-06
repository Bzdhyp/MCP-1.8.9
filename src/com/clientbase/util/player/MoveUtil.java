package com.clientbase.util.player;

import com.clientbase.util.IMinecraft;

public class MoveUtil implements IMinecraft {
    public static void stop() {
        mc.thePlayer.motionX = 0;
        mc.thePlayer.motionZ = 0;
    }
}
