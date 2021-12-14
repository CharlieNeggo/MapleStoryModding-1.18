package com.charlieNgo.maplestorymod.slots;

import net.minecraftforge.eventbus.api.IEventBus;

public enum MapleSlot {
    SHOULDER(MapleSlot.Type.ARMOR, 4, 5, "shoulder"),
    PENDANT(MapleSlot.Type.ARMOR, 5, 6, "pendant"),
    RING(MapleSlot.Type.ARMOR, 6, 7, "ring"),
    GLOVES(MapleSlot.Type.ARMOR, 7, 8, "gloves");

    private final MapleSlot.Type type;
    private final int index;
    private final int filterFlag;
    private final String name;

    MapleSlot(MapleSlot.Type p_20739_, int p_20740_, int p_20741_, String p_20742_) {
        this.type = p_20739_;
        this.index = p_20740_;
        this.filterFlag = p_20741_;
        this.name = p_20742_;
    }

    public MapleSlot.Type getType() {
        return this.type;
    }

    public int getIndex() {
        return this.index;
    }

    public int getIndex(int p_147069_) {
        return p_147069_ + this.index;
    }

    public int getFilterFlag() {
        return this.filterFlag;
    }

    public String getName() {
        return this.name;
    }

    public static MapleSlot byName(String p_20748_) {
        for(MapleSlot MapleSlot : values()) {
            if (MapleSlot.getName().equals(p_20748_)) {
                return MapleSlot;
            }
        }

        throw new IllegalArgumentException("Invalid slot '" + p_20748_ + "'");
    }

    public static MapleSlot byTypeAndIndex(MapleSlot.Type p_20745_, int p_20746_) {
        for(MapleSlot MapleSlot : values()) {
            if (MapleSlot.getType() == p_20745_ && MapleSlot.getIndex() == p_20746_) {
                return MapleSlot;
            }
        }

        throw new IllegalArgumentException("Invalid slot '" + p_20745_ + "': " + p_20746_);
    }

    public void register(IEventBus modEventBus) {
    }

    public static enum Type {
        ARMOR;
    }
}
