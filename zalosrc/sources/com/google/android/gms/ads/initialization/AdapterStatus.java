package com.google.android.gms.ads.initialization;

/* loaded from: classes2.dex */
public interface AdapterStatus {

    /* loaded from: classes2.dex */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
