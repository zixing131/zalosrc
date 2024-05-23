package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p538u5.AbstractC27034a;
import p538u5.AbstractC27036c;

/* renamed from: com.google.android.gms.common.internal.v1 */
/* loaded from: classes2.dex */
public final class C4228v1 extends AbstractC27034a implements InterfaceC4187i {
    public C4228v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4187i
    public final Account zzb() {
        Parcel m139176E = m139176E(2, m139177N());
        Account account = (Account) AbstractC27036c.m139178a(m139176E, Account.CREATOR);
        m139176E.recycle();
        return account;
    }
}
