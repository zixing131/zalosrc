package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C4239z0();

    /* renamed from: p */
    private final int f16561p;

    /* renamed from: q */
    private final boolean f16562q;

    /* renamed from: r */
    private final boolean f16563r;

    /* renamed from: s */
    private final int f16564s;

    /* renamed from: t */
    private final int f16565t;

    public RootTelemetryConfiguration(int i11, boolean z11, boolean z12, int i12, int i13) {
        this.f16561p = i11;
        this.f16562q = z11;
        this.f16563r = z12;
        this.f16564s = i12;
        this.f16565t = i13;
    }

    /* renamed from: F */
    public int m19618F() {
        return this.f16565t;
    }

    /* renamed from: J */
    public boolean m19619J() {
        return this.f16562q;
    }

    /* renamed from: K */
    public boolean m19620K() {
        return this.f16563r;
    }

    /* renamed from: M */
    public int m19621M() {
        return this.f16561p;
    }

    /* renamed from: t */
    public int m19622t() {
        return this.f16564s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, m19621M());
        AbstractC2552a.m12914c(parcel, 2, m19619J());
        AbstractC2552a.m12914c(parcel, 3, m19620K());
        AbstractC2552a.m12924m(parcel, 4, m19622t());
        AbstractC2552a.m12924m(parcel, 5, m19618F());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
