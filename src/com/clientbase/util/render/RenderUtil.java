package com.clientbase.util.render;

import com.clientbase.util.IMinecraft;
import net.minecraft.client.renderer.GlStateManager;

import static org.lwjgl.opengl.GL11.GL_GREATER;

public class RenderUtil implements IMinecraft {
    public static void resetColor() {
        GlStateManager.color(1, 1, 1, 1);
    }

    public static void setAlphaLimit(float limit) {
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc(GL_GREATER, (float) (limit * .01));
    }
}
