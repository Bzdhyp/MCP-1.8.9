package com.clientbase.events;

import net.minecraft.network.Packet;

public class EventPacketSend extends EventPacket {
    public EventPacketSend(Packet<?> packet) {
        super(packet);
    }
}
