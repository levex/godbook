package com.infernostats;

import net.runelite.client.party.messages.PartyMessage;
public class PreachMessage extends PartyMessage {
    String n;
    boolean r;
    long s;

    public PreachMessage(String n, boolean r, long s) {
        this.n = n;
        this.r = r;
        this.s = s;
    }
}
