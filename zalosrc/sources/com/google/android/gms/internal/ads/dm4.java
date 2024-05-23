package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class dm4 {

    /* renamed from: a */
    private final cm4 f19337a;

    /* renamed from: b */
    private final AtomicBoolean f19338b = new AtomicBoolean(false);

    public dm4(cm4 cm4Var) {
        this.f19337a = cm4Var;
    }

    /* renamed from: a */
    public final jm4 m21494a(Object... objArr) {
        Constructor zza;
        synchronized (this.f19338b) {
            if (!this.f19338b.get()) {
                try {
                    zza = this.f19337a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f19338b.set(true);
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating extension", e11);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (jm4) zza.newInstance(objArr);
        } catch (Exception e12) {
            throw new IllegalStateException("Unexpected error creating extractor", e12);
        }
    }
}
