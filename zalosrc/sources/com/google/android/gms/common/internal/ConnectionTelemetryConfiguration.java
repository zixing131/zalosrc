package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C4195k1();

    /* renamed from: p */
    private final RootTelemetryConfiguration f16529p;

    /* renamed from: q */
    private final boolean f16530q;

    /* renamed from: r */
    private final boolean f16531r;

    /* renamed from: s */
    private final int[] f16532s;

    /* renamed from: t */
    private final int f16533t;

    /* renamed from: u */
    private final int[] f16534u;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z11, boolean z12, int[] iArr, int i11, int[] iArr2) {
        this.f16529p = rootTelemetryConfiguration;
        this.f16530q = z11;
        this.f16531r = z12;
        this.f16532s = iArr;
        this.f16533t = i11;
        this.f16534u = iArr2;
    }

    /* renamed from: F */
    public int[] m19611F() {
        return this.f16532s;
    }

    /* renamed from: J */
    public int[] m19612J() {
        return this.f16534u;
    }

    /* renamed from: K */
    public boolean m19613K() {
        return this.f16530q;
    }

    /* renamed from: M */
    public boolean m19614M() {
        return this.f16531r;
    }

    /* renamed from: Q */
    public final RootTelemetryConfiguration m19615Q() {
        return this.f16529p;
    }

    /* renamed from: t */
    public int m19616t() {
        return this.f16533t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, this.f16529p, i11, false);
        AbstractC2552a.m12914c(parcel, 2, m19613K());
        AbstractC2552a.m12914c(parcel, 3, m19614M());
        AbstractC2552a.m12925n(parcel, 4, m19611F(), false);
        AbstractC2552a.m12924m(parcel, 5, m19616t());
        AbstractC2552a.m12925n(parcel, 6, m19612J(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
