package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import p001a.p005d.AbstractC0007b;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ur2 {
    /* renamed from: a */
    public static /* synthetic */ boolean m27046a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!AbstractC0007b.m4a(atomicReference, null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
