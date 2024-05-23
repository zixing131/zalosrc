package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C4192j1();

    /* renamed from: p */
    Bundle f16693p;

    /* renamed from: q */
    Feature[] f16694q;

    /* renamed from: r */
    int f16695r;

    /* renamed from: s */
    ConnectionTelemetryConfiguration f16696s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(Bundle bundle, Feature[] featureArr, int i11, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f16693p = bundle;
        this.f16694q = featureArr;
        this.f16695r = i11;
        this.f16696s = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12916e(parcel, 1, this.f16693p, false);
        AbstractC2552a.m12937z(parcel, 2, this.f16694q, i11, false);
        AbstractC2552a.m12924m(parcel, 3, this.f16695r);
        AbstractC2552a.m12932u(parcel, 4, this.f16696s, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
