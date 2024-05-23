package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class in2 {
    /* renamed from: a */
    public static void m23309a(AtomicReference atomicReference, hn2 hn2Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            hn2Var.zza(obj);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            yk0.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }
}
