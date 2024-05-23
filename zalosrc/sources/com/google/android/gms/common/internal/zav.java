package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC4187i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C4206o0();

    /* renamed from: p */
    final int f16683p;

    /* renamed from: q */
    final IBinder f16684q;

    /* renamed from: r */
    private final ConnectionResult f16685r;

    /* renamed from: s */
    private final boolean f16686s;

    /* renamed from: t */
    private final boolean f16687t;

    public zav(int i11, IBinder iBinder, ConnectionResult connectionResult, boolean z11, boolean z12) {
        this.f16683p = i11;
        this.f16684q = iBinder;
        this.f16685r = connectionResult;
        this.f16686s = z11;
        this.f16687t = z12;
    }

    /* renamed from: F */
    public final InterfaceC4187i m19823F() {
        IBinder iBinder = this.f16684q;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC4187i.a.m19696N(iBinder);
    }

    /* renamed from: J */
    public final boolean m19824J() {
        return this.f16686s;
    }

    /* renamed from: K */
    public final boolean m19825K() {
        return this.f16687t;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (!this.f16685r.equals(zavVar.f16685r) || !AbstractC4199m.m19701a(m19823F(), zavVar.m19823F())) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final ConnectionResult m19826t() {
        return this.f16685r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16683p);
        AbstractC2552a.m12923l(parcel, 2, this.f16684q, false);
        AbstractC2552a.m12932u(parcel, 3, this.f16685r, i11, false);
        AbstractC2552a.m12914c(parcel, 4, this.f16686s);
        AbstractC2552a.m12914c(parcel, 5, this.f16687t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
