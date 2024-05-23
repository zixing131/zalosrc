package com.zing.zalo.zmedia.player.event;

/* loaded from: classes7.dex */
public abstract class IZMediaListener {
    long mNativeCallbackNode;

    public abstract void onEndSession();

    public abstract void onEvent(int i11);
}
