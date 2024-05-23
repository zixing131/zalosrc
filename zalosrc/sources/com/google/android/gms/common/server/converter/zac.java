package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C4257c();

    /* renamed from: p */
    final int f16738p;

    /* renamed from: q */
    final String f16739q;

    /* renamed from: r */
    final int f16740r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zac(int i11, String str, int i12) {
        this.f16738p = i11;
        this.f16739q = str;
        this.f16740r = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16738p);
        AbstractC2552a.m12934w(parcel, 2, this.f16739q, false);
        AbstractC2552a.m12924m(parcel, 3, this.f16740r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zac(String str, int i11) {
        this.f16738p = 1;
        this.f16739q = str;
        this.f16740r = i11;
    }
}
