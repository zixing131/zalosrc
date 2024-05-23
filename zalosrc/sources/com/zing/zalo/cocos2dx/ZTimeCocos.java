package com.zing.zalo.cocos2dx;

/* loaded from: classes3.dex */
public final class ZTimeCocos {
    private static native void nativeSetCurrentZTimeNano(long j11);

    public static void setCurrentZTimeNano(long j11) {
        try {
            nativeSetCurrentZTimeNano(j11);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
