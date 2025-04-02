package com.cubk.event;

public class Event {
    private boolean cancelled;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled() {
        this.cancelled = true;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public static class StateEvent extends Event {
        private boolean pre = true;

        public boolean isPre() {
            return pre;
        }

        public boolean isPost() {
            return !pre;
        }

        public void setPost() {
            pre = false;
        }
    }
}
