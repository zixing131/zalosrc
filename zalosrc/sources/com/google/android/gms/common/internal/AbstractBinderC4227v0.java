package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p538u5.AbstractBinderC27035b;

/* renamed from: com.google.android.gms.common.internal.v0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4227v0 extends AbstractBinderC27035b implements InterfaceC4230w0 {
    /* renamed from: N */
    public static InterfaceC4230w0 m19808N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof InterfaceC4230w0) {
            return (InterfaceC4230w0) queryLocalInterface;
        }
        return new C4224u0(iBinder);
    }
}
