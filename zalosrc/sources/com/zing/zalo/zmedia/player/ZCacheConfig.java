package com.zing.zalo.zmedia.player;

/* loaded from: classes.dex */
public class ZCacheConfig {
    private double addCacheSizePercent;
    private int baseSize;
    private double freeStoragePercent;
    private double maxCacheSizePercent;
    private int offCacheSize;
    private String path;
    private int timeToLive;
    private double totalStoragePercent;
    private int type;

    public double getAddCacheSizePercent() {
        return this.addCacheSizePercent;
    }

    public int getBaseSize() {
        return this.baseSize;
    }

    public double getFreeStoragePercent() {
        return this.freeStoragePercent;
    }

    public double getMaxCacheSizePercent() {
        return this.maxCacheSizePercent;
    }

    public int getOffCacheSize() {
        return this.offCacheSize;
    }

    public String getPath() {
        return this.path;
    }

    public int getTimeToLive() {
        return this.timeToLive;
    }

    public double getTotalStoragePercent() {
        return this.totalStoragePercent;
    }

    public int getType() {
        return this.type;
    }

    public void setAddCacheSizePercent(double d11) {
        this.addCacheSizePercent = d11;
    }

    public void setBaseSize(int i11) {
        this.baseSize = i11;
    }

    public void setFreeStoragePercent(double d11) {
        this.freeStoragePercent = d11;
    }

    public void setMaxCacheSizePercent(double d11) {
        this.maxCacheSizePercent = d11;
    }

    public void setOffCacheSize(int i11) {
        this.offCacheSize = i11;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setTimeToLive(int i11) {
        this.timeToLive = i11;
    }

    public void setTotalStoragePercent(double d11) {
        this.totalStoragePercent = d11;
    }

    public void setType(int i11) {
        this.type = i11;
    }
}
