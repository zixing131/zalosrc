package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ab3 {
    /* renamed from: a */
    public static /* synthetic */ boolean m20053a(Unsafe unsafe, Object obj, long j11, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j11, obj2, obj3)) {
            if (unsafe.getObject(obj, j11) != obj2) {
                return false;
            }
        }
        return true;
    }
}
