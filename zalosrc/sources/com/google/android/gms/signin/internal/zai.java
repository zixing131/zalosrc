package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C6213d();

    /* renamed from: p */
    final int f34723p;

    /* renamed from: q */
    final zat f34724q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zai(int i11, zat zatVar) {
        this.f34723p = i11;
        this.f34724q = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f34723p);
        AbstractC2552a.m12932u(parcel, 2, this.f34724q, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
