package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C4203n0();

    /* renamed from: p */
    final int f16679p;

    /* renamed from: q */
    private final Account f16680q;

    /* renamed from: r */
    private final int f16681r;

    /* renamed from: s */
    private final GoogleSignInAccount f16682s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zat(int i11, Account account, int i12, GoogleSignInAccount googleSignInAccount) {
        this.f16679p = i11;
        this.f16680q = account;
        this.f16681r = i12;
        this.f16682s = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16679p);
        AbstractC2552a.m12932u(parcel, 2, this.f16680q, i11, false);
        AbstractC2552a.m12924m(parcel, 3, this.f16681r);
        AbstractC2552a.m12932u(parcel, 4, this.f16682s, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zat(Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i11, googleSignInAccount);
    }
}
