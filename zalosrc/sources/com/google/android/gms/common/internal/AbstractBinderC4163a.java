package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC4187i;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4163a extends InterfaceC4187i.a {
    /* renamed from: Q */
    public static Account m19626Q(InterfaceC4187i interfaceC4187i) {
        Account account = null;
        if (interfaceC4187i != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = interfaceC4187i.zzb();
            } catch (RemoteException unused) {
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th2;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
