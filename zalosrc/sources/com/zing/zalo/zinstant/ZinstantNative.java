package com.zing.zalo.zinstant;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import ho0.AbstractC20110a;

/* loaded from: classes.dex */
public final class ZinstantNative extends ZinstantNativeBase {
    private static ZinstantNative INSTANCE;

    static {
        try {
            NativeLoader.m89238q(AbstractC17158i1.m91742a(), EnumC16739a.f84887d0);
        } catch (Throwable th2) {
            th2.printStackTrace();
            AbstractC20110a.m104540i(th2, "Could not load native library", new Object[0]);
        }
    }

    private ZinstantNative() {
    }

    public static ZinstantNative getInstance() {
        return INSTANCE;
    }
}
