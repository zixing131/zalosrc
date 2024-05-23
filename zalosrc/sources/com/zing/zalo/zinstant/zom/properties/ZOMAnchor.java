package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMAnchor {
    public int mHorizontalAlign;
    public int mVerticalAlign;

    public ZOMAnchor() {
        this.mVerticalAlign = 1;
        this.mHorizontalAlign = 2;
    }

    public static ZOMAnchor createObject() {
        return new ZOMAnchor();
    }

    public ZOMAnchor(int i11, int i12) {
        this.mVerticalAlign = i11;
        this.mHorizontalAlign = i12;
    }
}
