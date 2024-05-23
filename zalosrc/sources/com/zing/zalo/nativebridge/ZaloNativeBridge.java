package com.zing.zalo.nativebridge;

import android.content.Context;

/* loaded from: classes4.dex */
public class ZaloNativeBridge {
    static {
        try {
            System.loadLibrary("zalo_native_lib");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static native void check(Context context);

    public static native void initAESUtils(Context context, Object obj, byte[] bArr);
}
