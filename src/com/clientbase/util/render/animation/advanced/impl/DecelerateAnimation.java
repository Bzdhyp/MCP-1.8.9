package com.clientbase.util.render.animation.advanced.impl;

import com.clientbase.util.render.animation.advanced.Animation;
import com.clientbase.util.render.animation.advanced.Direction;

public class DecelerateAnimation extends Animation {

    public DecelerateAnimation(int ms, double endPoint) {
        super(ms, endPoint);
    }

    public DecelerateAnimation(int ms, double endPoint, Direction direction) {
        super(ms, endPoint, direction);
    }

    protected double getEquation(double x) {
        return 1 - ((x - 1) * (x - 1));
    }
}
