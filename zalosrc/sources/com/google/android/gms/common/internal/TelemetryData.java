package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C4226v();

    /* renamed from: p */
    private final int f16566p;

    /* renamed from: q */
    private List f16567q;

    public TelemetryData(int i11, List list) {
        this.f16566p = i11;
        this.f16567q = list;
    }

    /* renamed from: F */
    public final List m19623F() {
        return this.f16567q;
    }

    /* renamed from: J */
    public final void m19624J(MethodInvocation methodInvocation) {
        if (this.f16567q == null) {
            this.f16567q = new ArrayList();
        }
        this.f16567q.add(methodInvocation);
    }

    /* renamed from: t */
    public final int m19625t() {
        return this.f16566p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16566p);
        AbstractC2552a.m12907A(parcel, 2, this.f16567q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
