package com.zing.zalo.zinstant.zom.text;

/* loaded from: classes.dex */
public final class ZOMNativeInputText {
    private long mNativePointer;

    public ZOMNativeInputText(long j11) {
        this.mNativePointer = j11;
    }

    private final native long getValue(long j11);

    public final long getValuePointer() {
        return getValue(this.mNativePointer);
    }
}
