package com.clientbase.util;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class TimerUtil {
    public long lastMS = System.currentTimeMillis();

    public long time() {
        return System.nanoTime() / 1000000L - this.lastMS;
    }

    public long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }

    public boolean delay(final float milliSec) {
        return this.time() >= milliSec;
    }

    public void reset() {
        lastMS = System.currentTimeMillis();
    }

    public boolean hasTimeElapsed(Number time) {
        long ms = time.longValue();
        return System.currentTimeMillis() - lastMS > ms;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - this.lastMS;
    }

    public long getTime() {
        return System.currentTimeMillis() - lastMS;
    }

    public void setTime(long time) {
        lastMS = time;
    }

    public boolean hasReached(double milliseconds) {
        return (double) (this.getCurrentMS() - this.lastMS) >= milliseconds;
    }
    public static long randomDelay(final int minDelay, final int maxDelay) {
        return nextInt(minDelay, maxDelay);
    }
}
