package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.c6 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5320c6 {
    /* renamed from: a */
    public static Object m28968a(InterfaceC5337d6 interfaceC5337d6) {
        try {
            return interfaceC5337d6.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC5337d6.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
