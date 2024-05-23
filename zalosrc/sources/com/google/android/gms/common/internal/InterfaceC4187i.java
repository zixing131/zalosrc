package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import p538u5.AbstractBinderC27035b;

/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes2.dex */
public interface InterfaceC4187i extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.i$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends AbstractBinderC27035b implements InterfaceC4187i {
        /* renamed from: N */
        public static InterfaceC4187i m19696N(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof InterfaceC4187i) {
                return (InterfaceC4187i) queryLocalInterface;
            }
            return new C4228v1(iBinder);
        }
    }

    Account zzb();
}
