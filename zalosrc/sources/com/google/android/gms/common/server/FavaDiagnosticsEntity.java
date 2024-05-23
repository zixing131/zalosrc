package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p180g5.C19227a;

/* loaded from: classes2.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C19227a();

    /* renamed from: p */
    final int f16730p;

    /* renamed from: q */
    public final String f16731q;

    /* renamed from: r */
    public final int f16732r;

    public FavaDiagnosticsEntity(int i11, String str, int i12) {
        this.f16730p = i11;
        this.f16731q = str;
        this.f16732r = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16730p);
        AbstractC2552a.m12934w(parcel, 2, this.f16731q, false);
        AbstractC2552a.m12924m(parcel, 3, this.f16732r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
